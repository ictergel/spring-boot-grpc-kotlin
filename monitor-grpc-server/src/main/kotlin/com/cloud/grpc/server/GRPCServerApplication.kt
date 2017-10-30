package com.cloud.grpc.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class GRPCServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(GRPCServerApplication::class.java, *args)
}
