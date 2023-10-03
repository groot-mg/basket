# Basket Service

[![Build and test](https://github.com/groot-mg/basket-service/actions/workflows/basket-service-ci.yml/badge.svg)](https://github.com/groot-mg/basket-service/actions/workflows/basket-service-ci.yml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=groot-mg_basket-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=groot-mg_basket-service) [![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/groot-mg/basket-service/blob/main/LICENSE)

Basket Service is used to manage a customer basket. When a basket is closed it produces notification messages to kafka.

## Build, tests and run

### Build
Build with gradle (build + unit tests):
```
./gradlew build
```

### Functional tests
Run functional-tests:
```
./gradlew cucumber
```

`basket-service` depends on `Service Discovery`, so wiremock is used to mock it and test the functionalities of the application.

### Run
> [!WARNING]  
> The application contains dependencies and will throw exceptions on the logs if the dependencies are not started

Dependencies:
* `Service discovery` on port 8081
    * To start the Service discovery, go to [service-discovery](https://github.com/groot-mg/service-discovery) and start it manually, or go to [docker-local-setup](https://github.com/groot-mg/docker-local-setup) and start it via docker compose
    * Without the Service discovery the application logs a log of exceptions on console

Local app is available on the port `8083`, health check endpoint is [http://localhost:8083/basket-service/private/health](http://localhost:8083/basket-service/private/health)

```
./gradlew bootRun
 ```

Alternatively, it is possible to run using `java -jar basket-service-app/build/libs/basket-service-app.jar`

### Run together with the project

`basket-service` should run together with the Service discovery and other services, to run all together, please see [docker-local-setup](https://github.com/groot-mg/docker-local-setup).

## OpenAPI / Swagger

Open API and Swagger UI are available on the endpoints:
- [http://localhost:8083/basket-service/private/api-docs](http://localhost:8083/basket-service/private/api-docs)
- [http://localhost:8083/basket-service/private/swagger](http://localhost:8083/basket-service/private/swagger)