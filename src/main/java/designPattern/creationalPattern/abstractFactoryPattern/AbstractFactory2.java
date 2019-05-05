package designPattern.creationalPattern.abstractFactoryPattern;

public interface AbstractFactory2 {
    Cpu createCpu();

    Mainboard createMainboard();
}

class IntelFactory implements AbstractFactory2 {
    private int version;

    public IntelFactory(int version) {
        this.version = version;
    }

    @Override
    public Cpu createCpu() {
        return new IntelCpu(version);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(version);
    }
}

class AmdFactory implements AbstractFactory2 {
    private int version;

    public AmdFactory(int version) {
        this.version = version;
    }

    @Override
    public Cpu createCpu() {
        return new AmdCpu(version);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(version);
    }
}