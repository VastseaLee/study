package designPattern.structuralPattern.adapter.one.clazz;

public class Adapter extends Source implements Targetable{
    @Override
    public void f2() {
        System.out.println("Targetable method");
    }

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.f();
        targetable.f2();
    }
}
