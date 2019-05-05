package designPattern.creationalPattern.prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String,Shape> shapeMap = new HashMap<>();
    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static void main(String[] args) {
        loadCache();
        Shape clone1 = getShape("1");
        clone1.draw();

        Shape clone2 = getShape("2");
        clone2.draw();

        Shape clone3 = getShape("3");
        clone3.draw();

    }
}
