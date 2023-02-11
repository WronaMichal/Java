package com.javafee.task.mvcoop.backend;

import java.util.Objects;

public class Dish {
    private String name;
    private Double price;
    private int amount;

    //TODO: [ref. 1] pole przechowujące ilość dań danego rodzaju

    public Dish(String name, Double price) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    //TODO: konstruktor ustawiający wartość pola name (nazwa typu potrawy) oraz pola zawierającego cenę [ref. 1]

    public void displayDish(String name, int amount){
        System.out.print("Dish{name=" + name + ", amount =" + amount + "}");
    }

    //TODO: metoda wyświetlająca danie w postaci: "Dish{name=XXX, amount=YYY}


    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //TODO: metoda pozwalająca ustawić ilość dań danego rodzaju [ref. 1]

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
