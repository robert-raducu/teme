package Tema30_31;

//-For a list of strings, create a method that filters out strings with fewer than 5 characters,
// then converts each string to uppercase, and finally sorts them in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<String> stringOperations(List<String> culori){
        List<String> filteredString = new ArrayList<>();

        for(String culoare : culori){
            if(culoare.length() >= 5){
                filteredString.add(culoare.toUpperCase());
            }
        }

        Collections.sort(filteredString,Collections.reverseOrder());
        return filteredString;
    }


    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        colours.add("green");
        colours.add("orange");
        colours.add("purple");
        colours.add("black");
        colours.add("brown");
        colours.add("pink");
        colours.add("yellow");

        List<String> filteredColours = stringOperations(colours);

        System.out.println("The new filtered list of colours is: ");
        for(String filteredColour : filteredColours) {
            System.out.println(filteredColour);
        }
    }
}
