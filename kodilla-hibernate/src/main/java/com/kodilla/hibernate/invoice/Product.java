package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.manytomany.Employee;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }


    @OneToMany(cascade = CascadeType.ALL)
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
