package ru.demo.patterns.abstractfactory;

public class DogClothingFactory implements ClothingFactory {
    @Override
    public Clothing createClothing() {
        return new DogClothing();
    }
}
