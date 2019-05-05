package designPattern.creationalPattern.abstractFactoryPattern;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }
}

class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}