package Challenges_08;

// Given an array of 10 integers,
// count how many of them are even numbers and how many are odd. Print out both counts.

public class Challenge4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 15, 66, 7, 193, 31, 38, 99};
        int odd = 0, even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }
}
