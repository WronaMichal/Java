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
        int number = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = i * 5 + 1; j <= 5 * (i + 1); j++) {

                    System.out.print(j + " ");
                }
                System.out.println();
            }
            else {
                for (int j = 5 * (i + 1); j >=i * 5 + 1 ; j--) {

                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }



    public static void zadanie5(int n, int z) {
        int number = 0;
        for (int i = 0; i < z; i++) {
            number = number + 1;
            for (int j = 0; j < n; j++) {
                System.out.print(number);
            }
            System.out.print("|");
        }

    }

    public static void zadanie6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * i);
            }

            System.out.println();
        }
    }

    public static void zadanie7() {

    }

    public static void zadaniedrugie4(int n) {
        int number = 1;
        int count = 0;
        for (int i = 1; i >= 0; i += number) {

            if (i == n) {
                number = -1;
            }
            if (i == 0) {
                count++;
                if (count == 2) {
                    break;
                }
                i = 2;
                number = 1;
            }
            System.out.print(i + " ");
        }
    }

    public static void zadanie5drugie() {
        int firstSequence = 2;
        int secondSequence = 4;
//        System.out.print(firstSequence);
//        System.out.print(secondSequence);
        for (int i = 0; i < 10; i++) {
            int number = firstSequence + i;
            System.out.print(number);
            secondSequence = secondSequence + i;
            System.out.print(secondSequence);

        }
    }

    public static void zadanie6drugie() {
        int increment = 1;
        int secondSequence = 4;
        int count = 0;
        for (int i = 2; i >= 2; i += increment) {
            System.out.print(i);
            secondSequence = secondSequence + i - 2;
            System.out.print(secondSequence);
            if (i == 10) {
                increment = -1;
                count++;
                System.out.println();
            }
            if (count == 2) {
                break;
            }

        }
    }
}



