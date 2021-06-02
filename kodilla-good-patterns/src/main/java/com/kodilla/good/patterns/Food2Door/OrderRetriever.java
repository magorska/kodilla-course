package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public OrderRequest retriever() {

        Supplier supplier = new Supplier("Extra Food Shop", "Stefan",
                "Zamachowski", new BigDecimal(123456789));
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new Product("Oatmeal", "Poland", new BigDecimal
                (123456789), new BigDecimal(11.99)), 5);
        productsList.put(new Product("Jasmine rice", "Japan",new BigDecimal
                (987654321), new BigDecimal(15.99)), 3);
        productsList.put(new Product("Rice drink", "Poland",new BigDecimal
                (98761234), new BigDecimal(7.99)), 6);

        return new OrderRequest(supplier, productsList);
    }
}
