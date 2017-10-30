package com.cloud.grpc.server.grpc;

import com.chanct.monitor.grpc.lib.MonitorGrpc;
import com.chanct.monitor.grpc.lib.MonitorReply;
import com.chanct.monitor.grpc.lib.MonitorRequest;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @author icter
 */
@GrpcService(MonitorGrpc.class)
public class MonitorGrpcImpl extends MonitorGrpc.MonitorImplBase {
    public static Integer num = 0;
    public static final Integer fixNum = 1000;

    @Override
    public void sendMsg(MonitorRequest req, StreamObserver<MonitorReply> responseObserver) {
        num++;
        if (num % fixNum == 0) {
            System.out.println(num);
            System.out.println(System.currentTimeMillis());
        }
        MonitorReply reply = MonitorReply.newBuilder().setMessage(("Hello: " + req.getName())).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
