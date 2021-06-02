package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements SupplierProcess{

    private Map<Product, Integer> productsList = new HashMap<>();

    public ExtraFoodShop() {

        productsList.put(new Product("Oatmeal", "Poland", new BigDecimal
                (123456789), new BigDecimal(11.99)), 5);
        productsList.put(new Product("Jasmine rice", "Japan",new BigDecimal
                (987654321), new BigDecimal(15.99)), 3);
        productsList.put(new Product("Rice drink", "Poland",new BigDecimal
                (98761234), new BigDecimal(7.99)), 6);
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
