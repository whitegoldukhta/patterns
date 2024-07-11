package ru.demo.patterns.prototype;

import java.util.HashMap;

public class ShapeCache {
    private HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}