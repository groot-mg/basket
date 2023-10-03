package com.generoso.ft.basket.client.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JvmRecord
@JsonIgnoreProperties(ignoreUnknown = true)
data class PrivateHealthResponse(val status: String)