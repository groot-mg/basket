package com.generoso.ft.basket.steps

import com.generoso.ft.basket.client.Client
import com.generoso.ft.basket.client.RequestTemplate
import com.generoso.ft.basket.client.model.Endpoint
import com.generoso.ft.basket.state.ScenarioState
import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class RequestStepDefinitions @Autowired constructor(
    private val requestTemplates: Map<Endpoint, RequestTemplate>,
    private val client: Client,
    private val scenarioState: ScenarioState
) {

    @Given("an endpoint {} is prepared")
    fun thePrivateEndpointIsPrepared(endpoint: Endpoint) {
        scenarioState.requestTemplate = getRequestTemplate(endpoint)
    }

    @Given("an endpoint {} is prepared with path parameter {word}")
    fun anEndpointIsPreparedWithPathParameter(endpoint: Endpoint, pathParameter: String?) {
        val requestTemplate: RequestTemplate? = getRequestTemplate(endpoint)
        requestTemplate?.pathParameter(pathParameter)
        scenarioState.requestTemplate = requestTemplate
    }

    @When("the request is sent")
    fun theEndpointReceivesARequest() {
        val response = client.execute(scenarioState.requestTemplate!!)
        scenarioState.actualResponse = response
    }

    private fun getRequestTemplate(endpoint: Endpoint): RequestTemplate? {
        if (requestTemplates.containsKey(endpoint)) {
            return requestTemplates[endpoint]
        }
        throw RuntimeException("Invalid request template provided.")
    }
}
