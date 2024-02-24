package Challenges_03;

//Write a program where you perform operations between an integer and a double.
//Display the result and discuss why it is in that format (due to Numeric Promotion).
//Create a program that takes two byte values, adds them together, and stores the result
//in a byte variable. Explain why the result is or is not what you'd expect,
//based on the rules of numeric promotion.


public class Challenge7 {
    public static void main(String[] args){
        int intValue = 5;
        double doubleValue = 3.5;

        double result = intValue + doubleValue; // Integer promoted to double before addition

        System.out.println("Result: " + result);


        byte byteValue1 = 100;
        byte byteValue2 = 50;

        byte res = (byte) (byteValue1 + byteValue2); // Addition results in an int, needs explicit casting

        System.out.println("Result: " + res);

//        When you add two byte values, the result is implicitly promoted to an int.
//        This is because in Java, arithmetic operations involving byte, short, or char types
//        are automatically promoted to int if no wider type can accommodate the result.
//        Since an int can accommodate all possible values of a byte, the result of the addition
//        is an int. Therefore, explicit casting is required to store the result back into a byte
//        variable.
    }
}
