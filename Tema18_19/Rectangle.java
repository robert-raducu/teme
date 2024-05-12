package Tema18_19;

//Problem Statement:
//Design a class named Rectangle that contains:
//
//Two private double data fields named width and height that specify the width and
// height of the rectangle. The default values are 1 for both width and height.
//A no-arg constructor that creates a default rectangle.
//A constructor that creates a rectangle with the specified width and height.
//A method named getArea() that returns the area of this rectangle.
//A method named getPerimeter() that returns the perimeter.

public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getParameter() {
        return (2 * (this.getWidth() + this.getHeight()));
    }

    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
