package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class stuClass = Class.forName("reflect.Student");

        System.out.println("***************获取所有的“公有”方法*******************");
        Method[] ms = stuClass.getMethods();//包括父类和接口
        for (Method m:ms){
            System.out.println(m);
        }
        System.out.println();

        System.out.println("***************获取所有的方法，包括私有的*******************");
        ms = stuClass.getDeclaredMethods();//只算自己
        for (Method m:ms){
            System.out.println(m);
        }
        System.out.println();

        System.out.println("***************获取公有的show1()方法*******************");
        Method m = stuClass.getMethod("show1",String.class);
        System.out.println(m);
        //实例化一个Student对象
        Object obj = stuClass.getConstructor().newInstance();
        m.invoke(obj,"刘德华");
        System.out.println();

        System.out.println("***************获取私有的show4()方法******************");
        m = stuClass.getDeclaredMethod("show4", Integer.class);
        System.out.println(m);
        m.setAccessible(true);
        m.invoke(obj,23);

    }
}
