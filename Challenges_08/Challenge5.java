package Challenges_08;

import java.util.ArrayList;
import java.util.Scanner;

//Create an ArrayList that stores city names. Add at least five city names initially.
//Then, prompt the user to add a city name. If the city name is already in the list,
// display a message saying it's a duplicate; otherwise, add it to the list.

public class Challenge5 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Madrid");
        cities.add("Rome");
        cities.add("Berlin");
        cities.add("Bucharest");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your city: ");
        String newCity = scanner.next();

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i) == newCity) {
                System.out.println("The city you inserted earlier is a duplicate!");
                System.exit(0);
            }
        }

        cities.add(newCity);

        for(String city : cities){
            System.out.println(city);
        }
    }

}

