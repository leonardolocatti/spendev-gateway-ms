package br.com.llocatti.spendev.gateway.config;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class OpenApiConfig {

  @Bean
  @Lazy(false)
  public List<GroupedOpenApi> apis(
      SwaggerUiConfigParameters swaggerUiConfigParameters, RouteDefinitionLocator locator) {
    List<RouteDefinition> definitions = locator.getRouteDefinitions().collectList().block();

    if (definitions != null) {
      return definitions.stream()
          .filter(routeDefinition -> routeDefinition.getId().matches(".*-ms"))
          .map(
              routeDefinition -> {
                String name = routeDefinition.getId().replace("spendev-", "").replace("-ms", "");
                swaggerUiConfigParameters.addGroup(name);

                return GroupedOpenApi.builder()
                    .pathsToMatch("/" + name + "/**")
                    .group(name)
                    .build();
              })
          .toList();
    }

    return new ArrayList<>();
  }
}
