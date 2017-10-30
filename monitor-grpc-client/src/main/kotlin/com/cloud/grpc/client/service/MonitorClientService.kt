package com.cloud.grpc.client.service

import com.chanct.monitor.grpc.lib.MonitorGrpc
import com.chanct.monitor.grpc.lib.MonitorRequest
import io.grpc.Channel
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient
import org.springframework.stereotype.Service


/**
 * @author icter
 */
@Service
class MonitorClientService {
    @GrpcClient("monitor-grpc-server")
    private val serverChannel: Channel? = null

    fun sendMessage(name: String): String {
        val blockingStub = MonitorGrpc.newBlockingStub(serverChannel)
        val request = MonitorRequest.newBuilder().setName(name).build()
        val response = blockingStub.sendMsg(request)
        return response.message
    }
}