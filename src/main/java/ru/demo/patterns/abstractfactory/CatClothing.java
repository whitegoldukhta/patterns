package ru.demo.patterns.abstractfactory;

public class CatClothing implements Clothing{
    @Override
    public void getName() {
        System.out.println("Jumpsuit");
    }
}
