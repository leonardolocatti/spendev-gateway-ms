package br.com.llocatti.spendev.gateway.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class OpenApiConfigTest {

  @MockBean SwaggerUiConfigParameters swaggerUiConfigParameters;

  @MockBean RouteDefinitionLocator routeDefinitionLocator;

  @Test
  void testReturnEmptyList() {

    when(routeDefinitionLocator.getRouteDefinitions()).thenReturn(Flux.empty());

    OpenApiConfig openApiConfig = new OpenApiConfig();

    assertThat(openApiConfig.apis(swaggerUiConfigParameters, routeDefinitionLocator)).isEmpty();
  }

  @Test
  void testReturnNotEmptyList() {
    RouteDefinition routeDefinition = new RouteDefinition();
    routeDefinition.setId("route-ms");

    when(routeDefinitionLocator.getRouteDefinitions()).thenReturn(Flux.just(routeDefinition));

    OpenApiConfig openApiConfig = new OpenApiConfig();

    assertThat(openApiConfig.apis(swaggerUiConfigParameters, routeDefinitionLocator)).isNotEmpty();
  }
}
