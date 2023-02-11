package com.javafee.task.mvcoop.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private List<Dish> dishes = new ArrayList<>();
    private Client client;
    private Double price;
    private String id;

    public Order(Client client) {
        this.client = client;

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            id += String.valueOf(r.nextInt(100));
        }
    }

    public java.util.List<Dish> getDishes() {
        return dishes;
    }

    public String getId() {
        return id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
