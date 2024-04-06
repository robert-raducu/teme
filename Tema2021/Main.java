package Tema2021;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager object = new ListManager();
        ArrayList<Integer> numbers = object.initializeList();

        System.out.println("Contents of the ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
