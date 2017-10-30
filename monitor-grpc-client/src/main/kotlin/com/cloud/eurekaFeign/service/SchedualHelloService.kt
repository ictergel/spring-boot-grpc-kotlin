package com.cloud.eurekaFeign.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping



@FeignClient(value = "helloService")
interface SchedualHelloService{
    @RequestMapping(value = "/hello", method = arrayOf(RequestMethod.GET))
    fun sayHiFromClientOne(@RequestParam(value = "name") name: String): String
}