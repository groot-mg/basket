package com.generoso.ft.basket.client.model

enum class Endpoint(val path: String, val method: String) {
    PRIVATE_INFO("/basket-service/private/info", "GET"),
    PRIVATE_HEALTH_CHECK("/basket-service/private/health", "GET"),
    PRIVATE_METRICS("/basket-service/private/metrics", "GET"),
    PRIVATE_OPEN_API("/basket-service/private/api-docs", "GET"),
    PRIVATE_SWAGGER_REDIRECTION("/basket-service/private/swagger", "GET"),
    PRIVATE_SWAGGER_UI("/basket-service/private/swagger-ui/index.html", "GET"),
    HELLO_WORLD_PUBLIC("/basket-service/hello-world-public", "GET"),
    HELLO_WORLD("/basket-service/hello-world", "GET"),
    HELLO_WORLD_CLIENT("/basket-service/hello-world-client", "GET"),
    HELLO_WORLD_SALES("/basket-service/hello-world-sales", "GET")
}