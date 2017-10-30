package com.cloud.eurekaFeign

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class EurekaFeignApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaFeignApplication::class.java, *args)
}
