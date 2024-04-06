package Tema2021;

import java.util.ArrayList;
import java.util.List;

//-Create a class named ListManager. In this class, create a method named initializeList
//which takes no parameters and returns an ArrayList of integers. The method should create
//an ArrayList, add the integers 1 to 5 to the list, and then return the list.
public class ListManager {
    public ArrayList<Integer> initializeList() {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
