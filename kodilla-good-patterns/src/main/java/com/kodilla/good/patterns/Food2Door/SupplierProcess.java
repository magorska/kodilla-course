package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public interface SupplierProcess {
    boolean process(Supplier supplier, Map<Product, Integer> productsList);
}
