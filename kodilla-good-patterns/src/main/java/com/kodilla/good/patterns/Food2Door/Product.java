package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String productName;
    private String countryOfOrigin;
    private BigDecimal eanCode;
    private BigDecimal price;

    public Product(String productName, String countryOfOrigin, BigDecimal eanCode, BigDecimal price) {
        this.productName = productName;
        this.countryOfOrigin = countryOfOrigin;
        this.eanCode = eanCode;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) && Objects.equals(countryOfOrigin, product.countryOfOrigin) && Objects.equals(eanCode, product.eanCode) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, countryOfOrigin, eanCode, price);
    }
}
