package Challenges_08;

//Create an ArrayList containing names of fruits. Implement a custom sorting mechanism
//to arrange them in descending order based on their length. If two fruits have the same length,
//sort them in alphabetical order.

import java.util.ArrayList;

public class Challenge7 {
    public static void main(String[] args) {
        ArrayList<String> fruitsName = new ArrayList<>();

        fruitsName.add("mango");
        fruitsName.add("banana");
        fruitsName.add("rasberry");
        fruitsName.add("apple");
        fruitsName.add("kiwi");
        fruitsName.add("banana");
        fruitsName.add("blueberry");
        fruitsName.add("melon");
        fruitsName.add("grapes");

        String buffer;

        for (int i = 0; i < fruitsName.size() - 1; i++) {
            for (int j = i + 1; j < fruitsName.size(); j++) {
                if (fruitsName.get(i).length() < fruitsName.get(j).length() ||
                        (fruitsName.get(i).length() == fruitsName.get(j).length() && fruitsName.get(i).compareTo(fruitsName.get(j)) > 0)) {
                    buffer = fruitsName.get(i);
                    fruitsName.set(i, fruitsName.get(j));
                    fruitsName.set(j, buffer);
                }
            }
        }

        for(String fruit : fruitsName){
            System.out.print(fruit + " ");
        }

    }
}
