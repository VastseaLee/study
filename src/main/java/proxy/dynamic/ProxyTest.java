package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args){

        //创建一个实例对象，这个对象是被代理的对象
        Person stu = new Student("Young");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler ih = new StuInvocationHandler<Person>(stu);

        //创建一个代理对象来代理实例对象，代理对象中的每个方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(
                Person.class.getClassLoader(),new Class<?>[]{Person.class},ih);

        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }

}
