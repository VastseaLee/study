package proxy.staticc;

import proxy.staticc.Person;

public class Stu implements Person {

    private String name;

    public Stu(){}
    public Stu(String name){
        this.name = name;

    }
    @Override
    public void giveMoney() {
        System.out.println(name+"上交班费50");
    }
}
