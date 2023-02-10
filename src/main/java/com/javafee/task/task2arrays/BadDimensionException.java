package com.javafee.task.task2arrays;

public class BadDimensionException extends RuntimeException {
    public BadDimensionException() {
        super("Bad Dimension of array");
    }
    public BadDimensionException(String s) {
    }
}
