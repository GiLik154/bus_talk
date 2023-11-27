package com.hwacu.bustalk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BusTalkApplication

fun main(args: Array<String>) {
    runApplication<BusTalkApplication>(*args)
}
