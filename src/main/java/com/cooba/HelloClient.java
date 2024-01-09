package com.cooba;

import com.cooba.proto.HelloReply;
import com.cooba.proto.HelloRequest;
import com.cooba.rpc.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class HelloClient {
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;
    private final GreeterGrpc.GreeterStub asyncStub;

    public HelloClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        asyncStub = GreeterGrpc.newStub(channel);
    }


    public void shutdown() throws InterruptedException {
        //关闭连接
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public String sayHello(String name) {
        //构造服务调用参数对象
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        //调用远程服务方法
        HelloReply response = blockingStub.sayHello(request);
        //返回值
        return response.getMessage();
    }

    public String sayHelloAgain(String name) {
        //构造服务调用参数对象
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        //调用远程服务方法
        HelloReply response = blockingStub.sayHelloAgain(request);
        //返回值
        return response.getMessage();
    }


    public static void main(String[] args) throws InterruptedException {
        HelloClient client = new HelloClient("127.0.0.1", 50051);

        String content = client.sayHello("client");
        System.out.println(content);

        String content2 = client.sayHelloAgain("client");
        System.out.println(content2);

        client.shutdown();
    }

}
