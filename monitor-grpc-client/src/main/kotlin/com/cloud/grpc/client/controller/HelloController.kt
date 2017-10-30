package com.cloud.grpc.client.controller

import com.cloud.grpc.client.service.MonitorClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @Autowired
    var monitorClientService: MonitorClientService? = null

    @RequestMapping("/test")
    fun printMessage(@RequestParam(defaultValue = "Michael") name: String): String {
        return monitorClientService!!.sendMessage(name)
    }
}