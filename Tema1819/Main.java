package Tema1819;

public class Main {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        System.out.println("Parametrul dreptunghiului 1 este: " + obj1.getParameter());
        System.out.println("Aria dreptunghiului 1 este: " + obj1.getArea());

        System.out.println("-------------------------------------------");

        Rectangle obj2 = new Rectangle(5,10.1);
        System.out.println("Parametrul dreptunghiului 2 este: " + obj2.getParameter());
        System.out.println("Aria dreptunghiului 2 este: " + obj2.getArea());

        System.out.println("-------------------------------------------");

        Rectangle obj3 = new Rectangle();
        obj3.setHeight(5.5);
        obj3.setWidth(6.8);
        System.out.println("Parametrul dreptunghiului 3 este: " + obj3.getParameter());
        System.out.println("Aria dreptunghiului 3 este: " + obj3.getArea());
    }
}
