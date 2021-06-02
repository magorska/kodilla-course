package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements SupplierProcess{

    private Map<Product, Integer> productsList = new HashMap<>();

    public GlutenFreeShop() {
        productsList.put(new Product("Pasta", "Poland", new BigDecimal
                (65438765), new BigDecimal(4.99)), 6);
        productsList.put(new Product("Eggs 8 pieces", "Poland", new BigDecimal
                (76543345), new BigDecimal(13.99)), 7);
        productsList.put(new Product("Gouda cheese", "Poland", new BigDecimal
                (654323458), new BigDecimal(6.99)), 7);
    }
    public HashMap<Product, Integer> createAnOrder() {
        return new HashMap<>(productsList);
    }

    @Override
    public boolean process(Supplier supplier, Map<Product, Integer> productsList) {
        int quantity = 0;

        for(Map.Entry<Product, Integer> value : productsList.entrySet())
            quantity = productsList.get(value.getValue());

        if (quantity == 0) {
            System.out.println(supplier + ": Sorry, some of products are not available.");
            return false;
        }
        return true;
    }
}
