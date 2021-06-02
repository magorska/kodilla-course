package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements SupplierProcess{

    private Map<Product, Integer> productsList = new HashMap<>();

    public HealthyShop() {
        productsList.put(new Product("Almond drink", "Germany", new BigDecimal
                (1234432156), new BigDecimal(9.99)), 6);
        productsList.put(new Product("Pasta", "Poland", new BigDecimal
                (987667890), new BigDecimal(6.99)), 3);
        productsList.put(new Product("Oat drink", "Poland", new BigDecimal
                (12345437), new BigDecimal(8.99)), 7);
    }
    public HashMap<Product, Integer> creatAnOrder() {
        return new HashMap<>(productsList);
    }

    @Override
    public boolean process(Supplier supplier, Map<Product, Integer> productsList) {
        return true;
    }
}
