package Challenges_08;

import java.util.LinkedList;
import java.util.Scanner;

//Given a LinkedList storing student names, write a program that checks if a particular student
//name exists in the list. If it does, remove that name from the list.
public class Challenge6 {
    public static void main(String[] args) {

        LinkedList<String> studentNames = new LinkedList<>();

        studentNames.add("Andrei");
        studentNames.add("Maria");
        studentNames.add("Ileana");
        studentNames.add("Lavinia");
        studentNames.add("Andrei");
        studentNames.add("Dacian");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the name you want to erase: ");
        String tempName = scanner.next();

        boolean flag = false;
        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).equals(tempName)) {
                System.out.println("The student " + tempName + " exists!");
                studentNames.remove(i);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("The student " + tempName + " does not exist!");
        }

        System.out.println("--------------------------------");
        System.out.println("Final students' names list: ");
        System.out.println("--------------------------------");

        for (String name : studentNames) {
            System.out.println(name);
        }

    }
}
