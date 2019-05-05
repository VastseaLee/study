package designPattern.creationalPattern.prototype;

public class Circle extends Shape {
    public Circle() {
        setType("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw " + getType());
    }
}
