package proxy.staticc;

import proxy.staticc.Person;
import proxy.staticc.Stu;

public class StuProxy implements Person {
    //被代理的学生
    Stu stu;

    public StuProxy(Person stu){
        if(stu.getClass() == Stu.class) {
            this.stu = (Stu)stu;
        }
    }

    @Override
    public void giveMoney() {
        stu.giveMoney();
    }
}
