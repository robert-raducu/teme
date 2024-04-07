package Challenges_08;

//Create a shopping list with Array and print the values

public class Challenge1 {
    public static void main(String[] args) {
        String[] shoppingList = new String[]{"lapte","rosii","oua","paine","conserva de ton","branza"};
        //Shortcut
        //String[] shoppingList = {"lapte","rosii","oua","paine","conserva de ton","branza"};

        for(String item : shoppingList){
            System.out.println(item);
        }
    }
}
