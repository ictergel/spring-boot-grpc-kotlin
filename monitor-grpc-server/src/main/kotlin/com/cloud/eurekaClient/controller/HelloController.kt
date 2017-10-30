package com.cloud.eurekaClient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.Inet4Address
import java.net.InetAddress
import java.net.NetworkInterface
import java.net.SocketException


@RestController
class HelloController{

    @Value("\${server.port}")
    var port: String? = null

    @RequestMapping("/hello")
    fun home(@RequestParam name: String): String {
        return "" + getCurrentIp().toString() + " hi $name,i am from port:$port"
    }

    fun getCurrentIp(): InetAddress? {
        try {
            val networkInterfaces = NetworkInterface.getNetworkInterfaces()
            while (networkInterfaces.hasMoreElements()) {
                val ni = networkInterfaces.nextElement() as NetworkInterface
                val nias = ni.inetAddresses
                while (nias.hasMoreElements()) {
                    val ia = nias.nextElement() as InetAddress
                    if (!ia.isLinkLocalAddress && !ia.isLoopbackAddress && ia is Inet4Address) {
                        return ia
                    }
                }
            }
        } catch (e: SocketException) {
        }

        return null
    }
}