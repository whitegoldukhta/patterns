package ru.demo.patterns.factorymethod;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow meow meow meow meow meow");
    }
}
