package com.javafee.task.task2arrays;

import java.util.Scanner;

public class Task2Arrays {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        task1(n);
//        task2(n);
//        task3(n);
//        task4(n);
//        task5(n);
//        task6(n);
        task7(n,matrix);
    }

    public static int[][] displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }


    public static int[][] task1(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + 1;
            }
        }
        displayMatrix(matrix);
        return matrix;
    }

    public static void task2(int n) {
        int matrix[][] = task1(n);
        int matrix2[][] = matrix.clone();
        int[][] matrix3 = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        displayMatrix(matrix);
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

    public static void task4(int n) {
        int[][] matrix = task1(n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + 1 == j) {
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

    public static void task5(int n) {
        int[][] matrix = task1(n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j +1) {
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

    public static void task6(int n){
        int [][] matrix = task1(n);
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        displayMatrix(transpose);
    }
    public static void task7(int n, int [][] matrix1){
        int [][] matrix2 = task1(n);
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new BadDimensionException();
        }
        int rowM1 = matrix1.length, columnM1 = matrix1[0].length;
        int columnM2 = matrix2[0].length;
        int[][] matrix3 = new int[rowM1][columnM2];
        for (int i = 0; i < rowM1; i++) {
            for (int j = 0; j < columnM2; j++) {
                for (int k = 0; k < columnM1; k++)
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
        displayMatrix(matrix3);
    }
}
