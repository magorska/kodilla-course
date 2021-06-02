package com.kodilla.good.patterns.myAllegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product, int quantity);
}
