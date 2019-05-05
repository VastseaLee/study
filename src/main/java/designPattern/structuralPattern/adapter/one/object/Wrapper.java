package designPattern.structuralPattern.adapter.one.object;

import designPattern.structuralPattern.adapter.one.clazz.Source;
import designPattern.structuralPattern.adapter.one.clazz.Targetable;

public class Wrapper implements Targetable {
    private Source source;
    public Wrapper(Source source){
        this.source = source;
    }

    @Override
    public void f() {
        source.f();
    }

    @Override
    public void f2() {
        System.out.println("Targetable method");
    }

    public static void main(String[] args) {
        Targetable targetable = new Wrapper(new Source());
        targetable.f();
        targetable.f2();
    }
}
