package com.javafee.task.mvcoop.frontend;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getInputString(String message) {
        printMessage(message);
        return scanner.next();
    }
}
