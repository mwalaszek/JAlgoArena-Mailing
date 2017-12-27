package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@EnableEurekaClient
@Configuration
open class JAlgoArenaMailingApp

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaMailingApp::class.java, *args)
}
