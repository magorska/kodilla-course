package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("brushes");
        Product product2 = new Product("paints");
        Product product3 = new Product("canvas");
        Product product4 = new Product("pencils");

        Item item1 = new Item(product1, new BigDecimal(25.99), 1, new BigDecimal(25.99));
        Item item2 = new Item(product2, new BigDecimal(8.99), 24, new BigDecimal(215.76));
        Item item3 = new Item(product3, new BigDecimal(5.99), 6, new BigDecimal(35.94));
        Item item4 = new Item(product4, new BigDecimal(4.99), 1, new BigDecimal(4.99));

        List<Item> itemsList = new ArrayList<>();

        Invoice invoice= new Invoice("Invoice number: 15/06/2021", itemsList);

        //When


        //Then





    }
}
