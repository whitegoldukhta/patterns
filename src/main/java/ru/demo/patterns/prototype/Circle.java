package ru.demo.patterns.prototype;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                '}';
    }
}
