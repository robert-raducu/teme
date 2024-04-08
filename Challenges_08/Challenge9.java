package Challenges_08;

//Accept a string representation of a binary number, e.g., "1011". Convert this string into an
//Integer using the Integer wrapper class and the method that parses binary.
//Print out the decimal representation of this number.

public class Challenge9 {
    public static Integer convertor(String binaryNumber){
        int decimalValue = Integer.parseInt(binaryNumber, 2);
        return decimalValue;
    }

    public static void main(String[] args) {
        String binaryRepresentation = "1011";

        System.out.println("The value of number " + binaryRepresentation + ", in decimal, is " + convertor(binaryRepresentation));
    }
}
