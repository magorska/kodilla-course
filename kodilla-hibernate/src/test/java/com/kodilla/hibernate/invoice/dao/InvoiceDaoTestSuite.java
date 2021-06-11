package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

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

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);

        List<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);

        Invoice invoice= new Invoice("Invoice number: 15/06/2021", itemsList);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When

        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, invoiceID);

        //Clean up
        invoiceDao.delete(invoice);
    }
}
