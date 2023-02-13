package com.javafee.task.mvcoop.frontend;

import com.javafee.task.mvcoop.backend.Client;
import com.javafee.task.mvcoop.backend.Dish;
import com.javafee.task.mvcoop.backend.Restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Restaurant restaurant;
    String idOrder;

    public Controller(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    //TODO: dostosuj program, tak aby był jak najwygodniejszy w użytku
    public void run() {
        System.out.println("Witaj w restauracji");
        String choice = "";
        do {
            System.out.println("Co chcesz zrobić?\n1 - dodać danie do menu,\n2 - zamówić danie,\n3 - wyświetlić menu, \n4 - wyświetlić zamówienie, \n5 - wyjść z programu");
            System.out.println("Podaj wybór: ");
            choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1" -> performActionForAdd();
                case "2" -> performActionForOrder();
                case "3" -> performActionForMenu();
                case "4" -> performActionForClientOrder();
                //TODO: dodaj akcję wyświetlającą menu, dodaj zmiany na wszystkich poziomach (we wszystkich klasach)
                default -> {
                    if (!"5".equals(choice)) System.out.println("Nieprawidłowy wybór");
                }
            }
        } while (!choice.equals("5"));
    }

    private void performActionForAdd() {
        System.out.println("Podaj nazwę dania (powinna być unikalna): ");
        String dishName = new Scanner(System.in).nextLine();
        System.out.println("Podaj cenę dania: ");
        int price = new Scanner(System.in).nextInt();
        restaurant.addToMenu(dishName, (double) price);
        //TODO: zamiast null system powinien wczytać od użytkownika cenę dania
        System.out.println("Danie " + dishName + " z ceną " + price + " zostało dodane do menu");
        //TODO: dopisz kod który poinformuje użytkownika o dodaniu dania do karty menu
    }

    private void performActionForOrder() {
        System.out.println("Proszę podać imię klienta: ");
        String name = new Scanner(System.in).nextLine();
        Client client = new Client(name);
        //TODO: wczytaj imię klienta, pamiętaj, że do metody makeOrder musisz przekazać obiekt typu Client
        String choice = "";
        int amount;
        List<String> dishesName = new ArrayList<>();
        List<Integer> amounts = new ArrayList<>();
        while (true) {
            System.out.println("Podaj nazwę dania które chcesz dodać do zamówienia lub wciśnij q: ");
            choice = new Scanner(System.in).nextLine();
            if (!choice.equals("q"))
                dishesName.add(choice);
            else break;
            System.out.println("Podaj ilość dania, które dodałeś do zamówienia: ");
            amount = new Scanner(System.in).nextInt();
            amounts.add(amount);
        }
        //TODO: analogicznie do wczytywania nazw dań, dodaj wczytywanie ilości dań
        String idOrder = restaurant.makeOrder(dishesName, amounts, client); //TODO: przekaż do metody ilości dań (listę) oraz klienta
        System.out.println(idOrder);
    }

    private void performActionForMenu() {
        List<Dish> menu = restaurant.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getName() + " - " + menu.get(i).getPrice());
        }
    }

    private void performActionForClientOrder() {
            System.out.println("Łączna kwota do zapłacenia: " + restaurant.getOrderPrice(idOrder));
    }
}