package ru.demo.patterns.prototype;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + type + '\'' +
                '}';
    }
}
