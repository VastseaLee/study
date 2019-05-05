package designPattern.creationalPattern.factoryPattern;

public class Demo {
    public static void main(String[] args) {
        //普通的工厂（用文字）
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("RECTANGLE").draw();
        System.out.println("-----------------------------------------");

        //普通的工厂（把方法写成静态）
        ShapeFactory.getCircle().draw();
        ShapeFactory.getRectangle().draw();
        ShapeFactory.getSquare().draw();
        System.out.println("-----------------------------------------");

        //工厂方法
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
