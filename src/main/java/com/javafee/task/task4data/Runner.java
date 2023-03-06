package com.javafee.task.task4data;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node("Are you under 7 yo?");
        tree.root.right = tree.addRight(tree.root, "Please contact your doctor ASAP");
        tree.root.left = tree.addLeft(tree.root, "Is your pain strong?");
        tree.root.left.left = tree.addLeft(tree.root.left, "Do you have problems with eyes?");
        tree.root.left.left.left = tree.addLeft(tree.root.left.left, "Please contact your doctor ASAP");
        tree.root.left.right = tree.addRight(tree.root.left, "Is the pain stronger during cough?");
        tree.root.left.right.left = tree.addLeft(tree.root.left.right, "Is the pain stronger during run?");
        tree.root.left.right.left.left = tree.addLeft(tree.root.left.right.left, "It's migrene");
        tree.root.left.right.left.right = tree.root.left.left;
        tree.root.left.right.right = tree.root.left.left;
        tree.root.left.right.right.right = tree.root.right;

        Node current = tree.root;
        System.out.println(current.answer);
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        while (true) {
            if (answer.equals("yes")) {
                System.out.println(current.right.answer);
                current = current.right;
                answer = input.nextLine();
            } else if (answer.equals("no")) {
                System.out.println(current.left.answer);
                current = current.left;
                answer = input.nextLine();
            } else if (answer.equals("exit")) {
                break;
            } else {
                System.out.println("Please answer question - yes/no");
                answer = input.nextLine();
            }
        }

    }
}
