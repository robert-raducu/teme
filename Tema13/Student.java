package Tema13;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Student's name is: " + name);
        System.out.println("Student's age is: " + age);
    }
}
