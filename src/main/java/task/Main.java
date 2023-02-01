package task;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Zestaw1.kwadrat();
//        Zestaw1.trojkat();
//        Zestaw1.trojkat2();
//        Zestaw1.ramka();
//        Zestaw1.ramkaPrzekatne();
//        Zestaw1.piramida();
//        Zestaw1.rocznePrzychody(12);
        BankAccount bankAccount = new BankAccount(200.0);
        Scanner input = new Scanner(System.in);
        System.out.println("1. Wpłata na konto "+ "\n" +"2. Wypłata z konta" +"\n"+
    "3. Menu przycisków" + "\n" + "4. Wyjście z programu");
        boolean inputIsNotInteger = true;
        while(inputIsNotInteger) {
            try {
                Integer.parseInt(input.nextLine());
                inputIsNotInteger = false;
            } catch (NumberFormatException e) {
                inputIsNotInteger = true;
                System.out.println("Proszę wpisać liczbę (1,2,3,4)");
            }
        }
        int choice = input.nextInt();
        boolean switchOn = true;
        while (switchOn) {
            switch (choice) {
                case 1:
                    System.out.println("Jaką kwotę chcesz wpłacić?");
                    bankAccount.deposit_funds(input.nextDouble());
                    break;
                case 2:
                    System.out.println("Jaką kwotę chcesz wypłacić?");
                    bankAccount.withdraw_funds(input.nextDouble());
                    break;
                case 3:
                    System.out.println("1. Wpłata na konto "+ "\n" +"2. Wypłata z konta" +"\n"+
                            "3. Menu przycisków" + "\n" + "4. Wyjście z programu");
                    break;
                case 4:
                    System.out.println("Dziękujemy za skorzystanie z programu");
                    switchOn = false;
                    break;
                default:
                    switchOn = false;
                        break;
            }
            choice = input.nextInt();
        }
    }
}
