package Tema12;

//-Create a Java program to find and print the length of a given string.
//-Create a Java program that finds and prints the character at a given index(2) in a string.
//-Create a Java program that finds and prints the index of the first occurrence of a character in a string.
//-Create a Java program that prints a substring of a given string from a specified start index(1) to end index(3).
//-Create a Java program that converts a given string to uppercase and lowercase and prints both outputs.

public class Main {
    public static void main(String[] args) {
        String tema = "InCLUziUnE";
        System.out.println("Length of the string: " + tema.length());
        System.out.println("The character located at the given index is: " + tema.charAt(2));
        System.out.println("The index of the first occurence of a character is: " + tema.indexOf('z'));
        System.out.println("The substring of the given string is : " + tema.substring(2,10));
        System.out.println("The uppercase string is : " + tema.toUpperCase() + " and the lowercase is: " + tema.toLowerCase());
    }
}
