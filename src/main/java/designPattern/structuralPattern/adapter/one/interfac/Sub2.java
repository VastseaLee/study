package designPattern.structuralPattern.adapter.one.interfac;

public class Sub2 extends Wrapper2 {
    @Override
    public void f2() {
        System.out.println("Sub2 f2()");
    }

    public static void main(String[] args) {
        Sourceable s1 = new Sub();
        Sourceable s2 = new Sub2();

        s1.f();
        s1.f2();
        System.out.println("----------------------");
        s2.f();
        s2.f2();
    }
}
