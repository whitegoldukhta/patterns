package ru.demo.patterns;

import ru.demo.patterns.abstractfactory.ClothingFactory;
import ru.demo.patterns.abstractfactory.DogClothingFactory;
import ru.demo.patterns.builder.House;
import ru.demo.patterns.factorymethod.AnimalFactory;
import ru.demo.patterns.factorymethod.CatFactory;
import ru.demo.patterns.prototype.Shape;
import ru.demo.patterns.prototype.ShapeCache;

//@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PatternsApplication.class, args);
		House house = new House.HouseBuilder()
				.setFoundation("Concrete")
				.setStructure("Brick")
				.setRoof("Tile")
				.setFurnished(true)
				.setPainted(false)
				.build();
		System.out.println(house);

		AnimalFactory factory;
		factory = new CatFactory();
		factory.createAnimal().makeSound();

		ClothingFactory clothingFactory;
		clothingFactory = new DogClothingFactory();
		clothingFactory.createClothing().getName();

		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadCache();
		Shape shape = shapeCache.getShape("1");
		System.out.println(shape);
		Shape shape1 = shapeCache.getShape("1");
		System.out.println(shape.equals(shape1));
	}
}
