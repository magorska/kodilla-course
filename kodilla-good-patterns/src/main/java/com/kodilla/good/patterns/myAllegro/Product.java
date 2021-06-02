package com.kodilla.good.patterns.myAllegro;

import java.math.BigDecimal;

public class Product {
    private String nameOfProduct;
    private BigDecimal eanCode;
    private BigDecimal price;

    public Product(String nameOfProduct, BigDecimal eanCode, BigDecimal price) {
        this.nameOfProduct = nameOfProduct;
        this.eanCode = eanCode;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                nameOfProduct + '\'' +
                ", EAN code: " + eanCode +
                ", price: " + price;
    }
}
