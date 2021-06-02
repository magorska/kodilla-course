package com.kodilla.good.patterns.myAllegro;

import java.time.LocalDateTime;

public class OrderDto {

    public User user;
    public LocalDateTime orderDate;
    public Product product;
    public int quantity;
    public boolean isConfirmed;

    public OrderDto(User user, Product product, int quantity, boolean isConfirmed) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.isConfirmed = isConfirmed;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}