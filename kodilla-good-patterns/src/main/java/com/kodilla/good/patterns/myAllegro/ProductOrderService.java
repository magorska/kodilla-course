package com.kodilla.good.patterns.myAllegro;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{

    @Override
    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}
