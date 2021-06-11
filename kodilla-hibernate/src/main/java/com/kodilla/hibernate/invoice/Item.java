package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_PRODUCT")
    public Product getProduct() {
        return product;
    }
    @NotNull
    @Column(name = "PRODUCT_PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "PRODUCT_QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @NotNull
    @Column(name = "PRODUCT_VALUE")
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne
   @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
    private void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}