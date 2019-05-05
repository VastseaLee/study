package designPattern.creationalPattern.abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("Shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        if("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
