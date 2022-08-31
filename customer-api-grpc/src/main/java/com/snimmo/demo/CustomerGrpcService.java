package com.snimmo.demo;

import com.google.protobuf.Empty;
import com.snimmo.demo.customer.Customer;
import io.quarkus.grpc.GrpcService;

import io.smallrye.mutiny.Uni;

@GrpcService
public class CustomerGrpcService implements CustomerGrpc {

    @Override
    public Uni<CustomerList> get(Empty request) {
        return Uni.createFrom().nullItem();
    }

    @Override
    public Uni<Customer> getById(CustomerId request) {
        return null;
    }

    @Override
    public Uni<Customer> save(Customer request) {
        return null;
    }

    @Override
    public Uni<Customer> update(Customer request) {
        return null;
    }

}
