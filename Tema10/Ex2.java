package Tema10;

import java.util.Scanner;

//-folosind un switch verificam daca variabila primita de la utilizator este mai mare decat 100. Daca este adevarat afisam un mesaj.

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();

        switch (number > 100 ? 1 : 0) {
            case 1:
                System.out.println("The number is greater than 100");
                break;
            default:
                System.out.println("The number is not greater than 100");
                break;
        }
    }
}
