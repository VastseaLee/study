package designPattern.creationalPattern.factoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }

    public static Shape getCircle() {
        return new Circle();
    }

    public static Shape getRectangle() {
        return new Rectangle();
    }

    public static Shape getSquare() {
        return new Square();
    }
}
