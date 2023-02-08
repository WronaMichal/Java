package com.javafee.task.bankaccount;

public class BankAccount {
    public static void main(String[] args) {
        //        BankAccount bankAccount = new BankAccount(200.0);
//        Scanner input = new Scanner(System.in);
//        int choice;
//        while (true) {
//            System.out.println("\n" + "1. Wpłata na konto " + "\n" + "2. Wypłata z konta" + "\n" +
//                    "3. Menu przycisków" + "\n" + "4. Wyjście z programu");
//            if (input.hasNextInt()) {
//                choice = input.nextInt();
//                break;
//            } else {
//                System.out.print("Proszę wpisać liczbę (1,2,3,4)");
//
//            }
//            input = new Scanner(System.in);
//        }
//        boolean programWorking = true;
//        while (programWorking) {
//            switch (choice) {
//                case 1:
//                    System.out.println("Jaką kwotę chcesz wpłacić?");
//                    bankAccount.deposit_funds(input.nextDouble());
//                    break;
//                case 2:
//                    System.out.println("Jaką kwotę chcesz wypłacić?");
//                    bankAccount.withdraw_funds(input.nextDouble());
//                    break;
//                case 3:
//                    System.out.println("1. Wpłata na konto " + "\n" + "2. Wypłata z konta" + "\n" +
//                            "3. Menu przycisków" + "\n" + "4. Wyjście z programu");
//                    break;
//                case 4:
//                    System.out.println("Dziękujemy za skorzystanie z programu");
//                    programWorking = false;
//                    break;
//                default:
//                    programWorking = false;
//                    break;
//            }
//            choice = input.nextInt();
//        }
    }

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit_funds(double deposit) {
        this.balance += deposit;
        System.out.println("Twój obecny balans to " + this.balance);
    }

    public void withdraw_funds(double funds) {
        double currentDeposit = 0;
        if (funds > this.balance) {
            System.out.println("Niewystarczająca ilość środków na koncie. Twój balans to " +
                    this.balance);
        } else {
            currentDeposit = this.balance - funds;
            System.out.println("Twój obecny balans to " + currentDeposit);
        }

    }
}

