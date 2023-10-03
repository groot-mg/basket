package com.generoso.ft.basket.client

import com.generoso.ft.basket.client.model.Endpoint
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
@Qualifier("private")
class PrivateMetricsRequestTemplate(
    @Value("\${service.host}") host: String?,
    @Value("\${service.context-path:}") contextPath: String?
) :
    RequestTemplate(host!!, contextPath!!) {
    override val endpoint: Endpoint
        get() = Endpoint.PRIVATE_METRICS

    override fun defaultHeaders() {
        headers.clear()
    }
}
