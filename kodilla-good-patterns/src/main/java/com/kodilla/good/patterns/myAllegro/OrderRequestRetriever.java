package com.kodilla.good.patterns.myAllegro;

import com.kodilla.good.patterns.program.RentRequest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Leigh", "Lawrence", "l.lawrence@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2021,1,27,21,39,4);
        Product soldProduct = new Product("Kubota slippers", new BigDecimal("1234567890"), new BigDecimal("39.99"));
        int quantity = 1;

        return new OrderRequest(user, orderDate, soldProduct, quantity);
    }
}
