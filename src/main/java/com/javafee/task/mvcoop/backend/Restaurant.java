package com.javafee.task.mvcoop.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Restaurant {
    private List<Dish> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addToMenu(String name, Double price) {
        Dish dish = new Dish(name, price);
        menu.add(dish);
        //TODO: dodaje danie do menu przekazujac jego nazwe i cene (metoda add listy menu) [ref. 2]
    }

    public String makeOrder(List<String> nameOfDishes, List<Integer> amounts, Client client) {
        Order order = new Order(client);
        for (int i = 0; i < nameOfDishes.size(); i++)
            if (checkIfTheDishExistsInMenu(nameOfDishes.get(i))) {
                Dish dish = getDishByName(nameOfDishes.get(i));
                dish.setAmount(amounts.get(i));
                //TODO: ustawienie ilości dań danego rodzaju poprzez pobranie tej wartości jako amounts[i] i użycie metody setAmount (lub podobnej, w zależności od jej nazwy)
                order.getDishes().add(dish);
            } else
                return null;
        order.setPrice(calculatePrice(order.getDishes()));
        return order.getId();
    }

    public Double getOrderPrice(String id) {
        Optional<Order> order = orders.stream()
                .filter(o -> Objects.equals(o.getId(), id))
                .findAny();
        return order.map(Order::getPrice).orElse(null);
        //TODO: metoda wyszukująca dania w liście orderów i zwracająca sumaryczną cenę zamówienia, jeśli danego dania, o podanym id nie ma w liście zamówień, metoda zwraca null
    }

    public List<Dish> getMenu() {
        return menu;
    }

    private Double calculatePrice(List<Dish> dishes) {
        Double orderPrice = 0.00;
        for (int i = 0; i < dishes.size(); i++) {
            Dish dish = dishes.get(i);
            orderPrice += orderPrice + dish.getPrice();
        }
        //TODO: metoda obliczająca wartość zamówienia na podstawie dań, które znajdując się w liście (każde danie powinno mieć ustawioną swoją cenę. Cena dania jest ustawiana podczas dodawania dania do menu [ref. 2]
        return orderPrice;
    }

    private boolean checkIfTheDishExistsInMenu(String name) {
        for (Dish d : menu)
            if (d.getName().equals(name))
                return true;
        return false;
    }

    private Dish getDishByName(String name) {
        for (Dish d : menu)
            if (d.getName().equals(name))
                return d;
        return null;
    }
}
