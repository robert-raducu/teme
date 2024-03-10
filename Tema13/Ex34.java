package Tema13;

//-Write a program that prints the current date.
//-Print the date that will be after 10 days from today.

import java.time.LocalDate;

public class Ex34 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateAfterTenDays = LocalDate.now().plusDays(10);

        // Afisează data curentă
        System.out.println("Data curentă este: " + currentDate);
        System.out.println("Data care va fi după 10 zile de la data curentă este: " + dateAfterTenDays);
    }
}
