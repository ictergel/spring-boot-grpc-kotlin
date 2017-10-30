package com.cloud.eurekaFeign.controller

import com.cloud.eurekaFeign.service.SchedualHelloService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired



@RestController
class HelloController{
    @Autowired
    var schedualHelloService: SchedualHelloService? = null

    @RequestMapping(value = "/hello", method = arrayOf(RequestMethod.GET))
    fun sayHi(@RequestParam name: String): String {
        return schedualHelloService!!.sayHiFromClientOne(name)
    }
}