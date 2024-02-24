package Tema9;

//Create a program that defines a string variable with a value of "Hello".
//Use nested if statements to first check if the length of the string is greater than 5.
//If it is not, check if the string equals "Hello" and print the appropriate message in each case.

public class Ex1 {
    public static void main(String[] args){
        String word = "Hello";
        if (word.length() > 5) {
            System.out.println("The string is greater than 5 characters");
        }
        else{
            if(word == "Hello"){
                System.out.println("The word is 'Hello'!");
            }
            System.out.println("The string is not greater than 5 characters");
        }
    }
}
