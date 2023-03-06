package com.javafee.task.task4data;

public class Tree {
    Node root;

    public Tree() {
        Node root = null;
    }

    public Node addRight(Node current, String question) {
        if (current == null) {
            return new Node(question);
        } else {
            current.right = new Node(question);
        }
        return current.right;
    }

    public Node addLeft(Node current, String question) {
        if (current == null) {
            return new Node(question);
        }
        else {
            current.left = new Node(question);
        }
        return current.left;
    }
}
