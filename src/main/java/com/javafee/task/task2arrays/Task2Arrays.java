package com.javafee.task.task2arrays;

import java.util.Scanner;

public class Task2Arrays {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
//        task1(n);
//        task2(n);
        task3(n);

    }

    public static int[][] task1(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void task2(int n) {
        int matrix[][] = task1(n);
        int matrix2[][] = matrix.clone();
        int[][] matrix3 = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task3(int n) {
        int[][] matrix = task1(n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j] + " ");
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
