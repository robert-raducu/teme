package Tema26_27;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double>ratings = new ArrayList<>();
        ratings.add(2.87);
        ratings.add(5.0);
        ratings.add(3.99);
        ratings.add(1.69);
        Movie movie = new Movie("Cinderella","Animation",ratings);
        System.out.println("The average rating is: " + movie.finalRating());
    }
}
