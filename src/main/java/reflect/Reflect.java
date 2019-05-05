package reflect;

import java.lang.reflect.Constructor;

public class Reflect {
    public static void main(String[] args) throws Exception {
       //threeGetClassWays();
        controllerConstructors();
    }

    public static void threeGetClassWays(){
        Student stu = new Student();//这一new 产生一个Student对象，一个Class对象
        Class stuClass = stu.getClass();
        System.out.println(stuClass.getName());

        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);

        try {
            Class stuClass3 = Class.forName("Student");
            System.out.println(stuClass3 == stuClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /*
    * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
    *
    * 1.获取构造方法：
    * 		1).批量的方法：
    * 			public Constructor[] getConstructors()：所有"公有的"构造方法
    *           public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)
    * 		2).获取单个的方法，并调用：
    * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
    * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
    *
    * 			调用构造方法：
    * 			Constructor-->newInstance(Object... initargs)
    */
    public static void controllerConstructors() throws Exception {
        Class stuClass = Class.forName("Student");

        System.out.println("**********************所有公有构造方法*********************************");
        Constructor[] con = stuClass.getConstructors();
        for (Constructor c:con){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        con = stuClass.getDeclaredConstructors();
        for (Constructor c:con){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor c1 = stuClass.getConstructor();
        System.out.println(c1);
        System.out.println();

        //调用构造方法
        Object obj = c1.newInstance();
        System.out.println("obj:"+obj);
        Student stu = (Student) obj;
        System.out.println();

        System.out.println("******************获取私有构造方法，并调用*******************************");
        c1 = stuClass.getDeclaredConstructor(Character.class);
        System.out.println(c1);
        c1.setAccessible(true);//暴力访问
        obj = c1.newInstance('男');
    }
}