package com.javafee.task.mvcoop;

import com.javafee.task.mvcoop.backend.Restaurant;
import com.javafee.task.mvcoop.frontend.View;

public class Main {
    public static void main(String[] args) {
        new Controller(new Restaurant(), new View()).run();
    }
}
