package Challenges_08;

//In an array of strings representing movie titles, implement a linear search method to find
//whether a given movie title exists. If it does, print out its position in the array.


public class Challenge8 {

    public static int searchIndex(String[] movies, String movieTitle){
        for(int i = 0; i < movies.length; i++){
            if(movies[i].equals(movieTitle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] moviesTitle = new String[]{"Pe aripile vantului","Portretul lui Dorian Grey",
        "Ingerii lui Charlie","The devil wears Prada"};

        String movie1 = "The devil wears Prada";
        String movie2 = "Fast and Furious";

        int key1 = searchIndex(moviesTitle,movie1);
        if(key1 == -1){
            System.out.println("The element does not exist in the array");
        }
        else {
            System.out.println("The position in the array is at index: " + key1);
        }

        int key2 = searchIndex(moviesTitle,movie2);
        if(key2 == -1){
            System.out.println("The element does not exist in the array");
        }
        else {
            System.out.println("The position in the array is at index: " + key2);
        }
    }
}
