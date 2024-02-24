package Tema9;

//Create a program that defines a string variable with a value of "Winter".
//Use a switch statement to print a message for each season ("Winter", "Spring", "Summer", "Autumn").
//For "Winter", print "It's cold"; for "Spring", print "Flowers bloom"; for "Summer",
//print "It's hot"; for "Autumn", print "Leaves fall".

public class Ex3 {
    public static void main(String[] args){
        String season = "Winter";
        switch (season){
            case "Spring":
                System.out.println("Flowers bloom");
                break;
            case "Summer":
                System.out.println("It's hot");
                break;
            case "Autumn":
                System.out.println("Leaves fall");
                break;
            case "Winter":
                System.out.println("It's cold");
                break;
            default:
                System.out.println("Try again!");
        }

    }
}
