package Tema9;

//Create a Java program where you define a char variable with a value of 'A'.
//Use a switch statement to print a message for the values 'A', 'B', and 'C'.
//For 'A', print "Excellent"; for 'B', print "Good"; for 'C', print "Average".

public class Ex2 {
    public static void main(String[] args){
        char variable = 'A';
        switch (variable){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Incorrect mark");
        }
    }
}
