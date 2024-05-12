package Tema14_15;

//-Add 5 hours and 30 minutes to the current time and print it.
//-From a given LocalDateTime, extract the date and time and print them separately.
//-Generate a random integer between 1 and 100.
//-Choose a random element from the array {"apple", "banana", "cherry", "date"}.
//-Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList.

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //1
        LocalDateTime nowDate = LocalDateTime.now().plusHours(5).plusMinutes(30);

        System.out.println("Exercitiu 1: " + nowDate + "\n");

        //2
        System.out.println("Exercitiu 2: " + "Date: " + nowDate.toLocalDate() + " and time: " + nowDate.toLocalTime() + "\n");

        //3
        Random random = new Random();
        System.out.println("Exercitiu 3: " + random.nextInt(1, 100) + "\n");

        //4
        String[] fructe = {"apple", "banana", "cherry", "date"};
        int randNumber = random.nextInt(fructe.length);
        System.out.println("Exercitiu 4: " + fructe[randNumber] + "\n");

        //5
        ArrayList<String> pietreSemipretioase = new ArrayList<String>();
        pietreSemipretioase.add("Ametist");
        pietreSemipretioase.add("Agat");
        pietreSemipretioase.add("Onix");
        pietreSemipretioase.add("Turcoaz");
        pietreSemipretioase.add("Cuart");
        System.out.println("Exercitiu 5: " + "Numarul de elemente din ArrayList este: " + pietreSemipretioase.size());

    }
}
