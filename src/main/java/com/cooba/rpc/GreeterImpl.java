package com.cooba.rpc;

import com.cooba.proto.HelloReply;
import com.cooba.proto.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        System.out.println("Server say hello to " + req.getName());
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAgain(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello again " + req.getName()).build();
        System.out.println("Server say hello to " + req.getName() + "again");
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
