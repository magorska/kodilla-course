package com.kodilla.good.patterns.myAllegro;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}
