package designPattern.creationalPattern.abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        ComputerEngineer ce = new ComputerEngineer();
        AbstractFactory2 factory2 = new IntelFactory(25);
        ce.makeComputer(factory2);
    }
}
