package Tema13;

//-Create a Java program that uses a StringBuilder to concatenate an array of strings. The program should print the final concatenated string. (methods: append())

public class Ex1 {
    public static void main(String[] args) {
        String[] stringArray = {"Acesta","este","un","mesaj"};
        StringBuilder concatenare = new StringBuilder();

        for(String cuvant : stringArray){
            concatenare.append(cuvant);
        }

        System.out.println("Final concatenated string: " + concatenare);
    }
}
