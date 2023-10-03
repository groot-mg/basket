package com.generoso.basket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasketServiceApplication

fun main(args: Array<String>) {
    runApplication<BasketServiceApplication>(*args)
}
