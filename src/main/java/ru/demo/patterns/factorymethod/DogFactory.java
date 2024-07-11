package ru.demo.patterns.factorymethod;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
