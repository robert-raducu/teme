package Challenges_08;

//Create
//2 empty ArrayLists: studentList and graduateStudentList
//populate studentList with 10 students
//copy values from studentList to graduateStudentList
//iterate through graduateStudentList and print each graduated student

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("Robert Raducu");
        studentList.add("Andrei Popescu");
        studentList.add("Ioana Stanculescu");
        studentList.add("Alexandra Barbu");
        studentList.add("Andra Ion");
        studentList.add("Constantin Catana");
        studentList.add("Ionut Tataru");
        studentList.add("Laurentiu Stanciu");
        studentList.add("Andreea Dumitriu");
        studentList.add("Nicoleta Toporas");

        //pass the reference of one ArrayList to another, not duplicates
        graduateStudentList = studentList;
        //graduateStudentList.addAll(studentList);

        for(String name: graduateStudentList){
            System.out.println(name);
        }
    }
}
