package Tema11;

//-Create a Java program that uses a do-while loop to print numbers from 10 to 1 in descending order.

public class Ex3 {
    public static void main(String[] args) {
        int var = 10;
        do {
            System.out.println(var);
            var--;
        } while (var > 0);
    }
}
