package com.javafee.task.task4data;

public class Tree {
    private Node root;

    public Tree(Node root) {
        root = null;
    }

    public void add(String answer) {
        root = insert(root, answer);
    }

    public Node insert(Node node, String answer) {
        if (node == null) {
            node = new Node(answer);
        } else {
            if (answer.contains("yes")) {
                node.right = insert(node.right, answer);
            } else {
                node.left = insert(node.left, answer);
            }
        }
        return node;
    }
}
