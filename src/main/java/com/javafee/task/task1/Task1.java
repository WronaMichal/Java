package com.javafee.task.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
//        task1(n);
//        task2(n);
//        task3(n);
//        task4(n);
//        task5(n);
//        task6(n);
//        yearlyRevenue(n);

    }
    public static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void task2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void task3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n + 1 - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void task4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 3 == 1 || j == 1 || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void task5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i>1 && j %3==0 && i<n && i%3!=0 || i%3==0 && j%2==0)
                {
                    System.out.print(" ");}
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void task6(int n) {
        for (int i = 1; i <= n - 2; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void yearlyRevenue(int monthsNumber) {
        System.out.println("Program wylicza sumę, średnią, największy i najmniejszy przychód z podanej " +
                "liczby miesięcy");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int leastNumber = 0;
        int biggestNumber = 0;
        int count = 0;
        while (count < monthsNumber) {
            count++;
            System.out.println("Wpisz przychód za" + " " + count + " " + "miesiąc");
            int number = input.nextInt();
            sum = sum + number;
            if (count == 1) {
                leastNumber = number;
            } else if (leastNumber > number) {
                leastNumber = number;
            } else if (biggestNumber < number) {
                biggestNumber = number;
            }
        }
        System.out.println("Suma przychodów za " + monthsNumber + " miesięcy to " + sum + ", średnia przychodów to "
                + sum / monthsNumber + ", największy przychód za miesiąc to " + biggestNumber + ", najmniejszy przychód to " +
                leastNumber);
    }
}
