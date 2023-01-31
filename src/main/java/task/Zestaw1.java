package task;

import java.util.Scanner;

public class Zestaw1 {
    public static void kwadrat() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void trojkat() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void trojkat2() {
        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp <= 6 - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ramka() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i < 5 && i > 1) && (j > 1 && j < 4 || j == 5)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void ramkaPrzekatne() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i % 2 == 0 && j == 3 || i == 3 && j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void piramida() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 5; j >i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=(i*2)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void rocznePrzychody(int liczbaMiesiecy){
        System.out.println("Porgram wylicza sumę, średnią, największy i najmniejszy przychód z podanej " +
                "liczby miesięcy");
        Scanner input = new Scanner(System.in);
        int sum=0;
        int leastNumber =0;
        int biggestNumber =0;
        int count=0;
        while(count<liczbaMiesiecy){
            count++;
            System.out.println("Wpisz przychód za" + " " + count + " "+ "miesiąc");
            int number = input.nextInt();
            sum = sum+number;
            if(count ==0){
                leastNumber =number;
            }
            else if(leastNumber>number){
                leastNumber = number;
            }
            else if(biggestNumber<number){
                biggestNumber = number;
            }

        }
        System.out.println("Suma przychodów za " + liczbaMiesiecy + " miesięcy to " + sum + " ,średnia przychodów to "
        + sum/liczbaMiesiecy + " ,największy przychód za miesiąc to " + biggestNumber + " ,najmniejszy przychód to " +
                leastNumber);
    }
}
