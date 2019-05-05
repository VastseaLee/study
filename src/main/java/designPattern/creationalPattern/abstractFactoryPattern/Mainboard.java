package designPattern.creationalPattern.abstractFactoryPattern;

public interface Mainboard {
    void show();
}

class IntelMainboard implements Mainboard {
    private int cpuHoles;

    public IntelMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void show() {
        System.out.println("IntelMainboard:" + cpuHoles);
    }
}

class AmdMainboard implements Mainboard {
    private int cpuHoles;

    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void show() {
        System.out.println("AmdMainboard:" + cpuHoles);
    }
}