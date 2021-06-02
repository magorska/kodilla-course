package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class OrderRequest {
    private Supplier supplier;
    private Map<Product, Integer> productsListRequest;

    public OrderRequest(Supplier supplier, Map<Product, Integer> productsListRequest) {
        this.supplier = supplier;
        this.productsListRequest = productsListRequest;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Map<Product, Integer> getProductsListRequest() {
        return productsListRequest;
    }
}
