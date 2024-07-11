package ru.demo.patterns.abstractfactory;

public class DogClothing implements Clothing {
    @Override
    public void getName() {
        System.out.println("Jacket");
    }
}
