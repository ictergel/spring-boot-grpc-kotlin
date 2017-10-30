package com.cloud.grpc.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class GRPCClientApplication

fun main(args: Array<String>) {
    SpringApplication.run(GRPCClientApplication::class.java, *args)
}
