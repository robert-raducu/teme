package Challenges_08;

//Create a wishlist for Christmas with ArrayList and print the values

import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {

        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("candies");
        wishlist.add("mirror");
        wishlist.add("teddybear");
        wishlist.add("shoes");

        for(String gift:wishlist){
            System.out.println(gift);
        }
    }
}
