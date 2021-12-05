<h1 align="center">Spendev Gateway Microservice</h1>

<p align="center">
  <img alt="Sonar quality gate status metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=alert_status" />
  <img alt="Sonar maintainability rate metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=sqale_rating" />
  <img alt="Sonar reliability rate metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=reliability_rating" />
  <img alt="Sonar security rate metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=security_rating" />
  <img alt="Sonar coverage metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=coverage" />
  <img alt="Sonar vulnerability metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=vulnerabilities" />
  <img alt="Sonar bugs metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=bugs" />
  <img alt="Sonar code smells metric" src="https://sonarcloud.io/api/project_badges/measure?project=leonardolocatti_spendev-gateway-ms&metric=code_smells" />
</p>

## 📓 About

Gateway microservice used in Spendev (financial control app)

## 🔗 Prerequisites

This project depends on [Spendev Discovery Microservice](https://github.com/leonardolocatti/spendev-discovery-ms). To
run this one first run the other.

## ⏩ Running

```bash
mvn spring-boot:run

# The application will start a gateway on port 8765
```

## 🔨 Tech stack

- **[Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)**
- **[Spring Cloud Netflix](https://spring.io/projects/spring-cloud-netflix)**

> See the file [pom.xml](./pom.xml)