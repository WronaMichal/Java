package com.javafee.task.mvcoop.frontend;

import com.javafee.task.mvcoop.backend.Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        new Controller(restaurant).run();
    }
}
