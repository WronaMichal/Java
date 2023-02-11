package com.javafee.task.mvcoop.frontend;

import com.javafee.task.mvcoop.backend.Restaurant;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private View view = new View();
    private Restaurant restaurant = new Restaurant();

    //TODO: dostosuj program, tak aby był jak najwygodniejszy w użytku
    public void run() {
        view.printMessage("Witaj w restauracji");
        String choice = "";
        do {
            view.printMessage("Co chcesz zrobić?\n1 - dodać danie do zamówienia,\n2 - zamówić danie,\n3 - wyjść z programu");
            choice = view.getInputString("Podaj wybór: ");
            switch (choice) {
                case "1" -> performActionForAdd();
                case "2" -> performActionForOrder();
                //TODO: dodaj akcję wyświetlającą menu, dodaj zmiany na wszystkich poziomach (we wszystkich klasach)
                default -> {
                    if (!"3".equals(choice)) view.printError("Nieprawidłowy wybór");
                }
            }
        } while (!choice.equals("3"));
    }

    private void performActionForAdd() {
        restaurant.addToMenu(view.getInputString("Podaj nazwę dania (powinna być unikalna): "), null); //TODO: zamiast null system powinien wczytać od użytkownika cenę dania
        //TODO: dopisz kod który poinformuje użytkownika o dodaniu dania do karty menu
    }

    private void performActionForOrder() {
        //TODO: wczytaj imię klienta, pamiętaj, że do metody makeOrder musisz przekazać obiekt typu Client
        String choice = "";
        List<String> dishesName = new ArrayList<>();
        while (true) {
            view.printMessage("Podaj nazwę dania które chcesz dodać do zamówienia lub wciśnij q");
            choice = view.getInputString("Podaj nazwę lub q:");
            if (!choice.equals("q"))
                dishesName.add(choice);
            else break;
        }
        //TODO: analogicznie do wczytywania nazw dań, dodaj wczytywanie ilości dań
        restaurant.makeOrder(dishesName, null, null); //TODO: przekaż do metody ilości dań (listę) oraz klienta
    }
}