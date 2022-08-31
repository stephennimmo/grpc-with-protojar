package com.snimmo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import com.google.protobuf.Empty;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class CustomerGrpcServiceTest {

    @GrpcClient
    CustomerGrpc customerGrpc;

    @Test
    public void get() {
        CustomerList reply = customerGrpc
                .get(Empty.newBuilder().build()).await().atMost(Duration.ofSeconds(5));
        assertEquals(0, reply.getCustomersCount());
    }

}
