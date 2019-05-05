package proxy.staticc;

import proxy.staticc.Person;
import proxy.staticc.Stu;
import proxy.staticc.StuProxy;

public class TestProxy {
    public static void main(String[] args){
        Person stu = new Stu("Young");
        Person monitor = new StuProxy(stu);
        monitor.giveMoney();
    }
}
