package ru.demo.patterns.factorymethod;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
