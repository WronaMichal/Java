package task;

public class Zestaw2Loops {
    public static void zadanie1(int n, int firstNumber) {
        int number = 0;
        for (int i = 1; i <= n; i++) {
            if (number < firstNumber) {
                number = 2 * firstNumber;
                System.out.print(firstNumber + " ");
                System.out.print(number + " ");
            } else {
                number = 2 * number;
                System.out.print(number + " ");
            }

        }

    }

    public static void zadanie2(int n, int firstNumber) {
        int number = 0;
        for (int i = 1; i < n; i++) {
            if (number < firstNumber) {
                number = firstNumber * firstNumber;
                System.out.print(firstNumber + " ");
                System.out.print(number + " ");
            } else {
                number = number * firstNumber;
                System.out.print(number + " ");
            }
        }

    }

    public static void zadanie3(int n, int firstNumber) {
        int number = 0;
        for (int i = 1; i < n; i++) {
            if (number < firstNumber) {
                number = firstNumber * firstNumber;
                System.out.print(firstNumber + " ");
                System.out.print(number + " ");
            } else {
                number = number * firstNumber;
                System.out.print(number + " ");
                if (i == n - 1) {
                    for (int j = n - 1; j > 0; j--) {
                        number = number / firstNumber;
                        System.out.print(number + " ");
                    }

                }

            }

        }
    }

    public static void zadanie4(int n) {
        int increment = 1;
        int number=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >0; j--) {
                if (i % 2 == 0) {
                    int number2 = number+j;
                    System.out.print(number2 + " ");
                }
                else{
                    number = number + increment;
                    System.out.print(number + " ");
                }
            }
        }
    }
}
