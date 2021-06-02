package com.kodilla.good.patterns.myAllegro;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOfOrdering;
    public Product product;
    public int quantity;

    public OrderRequest(User user, LocalDateTime timeOfOrdering, Product product, int quantity) {
        this.user = user;
        this.timeOfOrdering = timeOfOrdering;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOfOrdering() {
        return timeOfOrdering;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

