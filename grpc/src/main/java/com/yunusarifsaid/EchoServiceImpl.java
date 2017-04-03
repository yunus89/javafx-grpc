package com.yunusarifsaid;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

/**
 * Created by Yunus on 3/19/2017.
 */
@GRpcService
public class EchoServiceImpl extends EchoServiceGrpc.EchoServiceImplBase  {
    @Override
    public void echo(EchoOuterClass.Echo request, StreamObserver<EchoOuterClass.Echo> responseObserver) {
        EchoOuterClass.Echo.Builder echoBuilder = EchoOuterClass.Echo.newBuilder();
        echoBuilder.setMessage("Came from client "+request.getMessage()+" ...by ServerSide(SS)");
        echoBuilder.setMessage("From server by Mr.Yunus");
        responseObserver.onNext(echoBuilder.build());
        responseObserver.onCompleted();
    }
}
