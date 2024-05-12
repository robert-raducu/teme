package Tema26_27;

//-Design a Movie class with attributes like title, genre, and a list of ratings.
// Create a method that retrieve the average rating for any movie.

import java.util.List;

public class Movie {
    String name;
    String genre;
    List<Double> ratings;

    public Movie(String name, String genre, List<Double> ratings) {
        this.name = name;
        this.genre = genre;
        this.ratings = ratings;
    }

    public String finalRating(){
        double sum = 0;
        for(Double rating : ratings){
            sum+=rating;
        }
        double finalRating = sum/ratings.size();
        return String.format("%.2f", finalRating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public void setRatings(List<Double> ratings) {
        this.ratings = ratings;
    }
}
