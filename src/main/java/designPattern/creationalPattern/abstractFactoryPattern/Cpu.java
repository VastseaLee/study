package designPattern.creationalPattern.abstractFactoryPattern;

public interface Cpu {
    void show();
}

class IntelCpu implements Cpu {
    private int pins;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void show() {
        System.out.println("IntelCpu:" + pins);
    }
}

class AmdCpu implements Cpu {
    private int pins;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void show() {
        System.out.println("AmdCpu:" + pins);
    }
}