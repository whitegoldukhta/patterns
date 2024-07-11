package ru.demo.patterns.abstractfactory;

public class CatClothingFactory implements ClothingFactory {

    @Override
    public Clothing createClothing() {
        return new CatClothing();
    }
}
