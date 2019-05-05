package designPattern.creationalPattern.abstractFactoryPattern;

public class ComputerEngineer {
    private Cpu cpu;
    private Mainboard mainboard;
    private void prepareHardwares(AbstractFactory2 af2){
        this.cpu = af2.createCpu();
        this.mainboard = af2.createMainboard();
        cpu.show();
        mainboard.show();
    }
    public void makeComputer(AbstractFactory2 af2){
        prepareHardwares(af2);
    }
}
