package designPattern.creationalPattern.prototype;

public class Square extends Shape {
    public Square() {
        setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Draw " + getType());
    }
}
