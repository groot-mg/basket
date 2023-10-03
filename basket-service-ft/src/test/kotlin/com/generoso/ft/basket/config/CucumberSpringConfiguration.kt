package com.generoso.ft.basket.config

import com.generoso.ft.basket.YamlFileApplicationContextInitializer
import io.cucumber.spring.CucumberContextConfiguration
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(
    classes = [TestConfiguration::class, LocalBasketServiceServer::class],
    initializers = [YamlFileApplicationContextInitializer::class]
)
@CucumberContextConfiguration
class CucumberSpringConfiguration