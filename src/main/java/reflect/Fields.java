package reflect;

import java.lang.reflect.Field;
public class Fields {
    public static void main(String[] args) throws Exception {
        Class stuClass = Class.forName("Student");

        System.out.println("************获取所有公有的字段********************");
        Field[] fs = stuClass.getFields();
        for (Field f:fs) {
            System.out.println(f);
        }
        System.out.println();

        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
        fs = stuClass.getDeclaredFields();
        for (Field f:fs){
            System.out.println(f);
        }
        System.out.println();

        System.out.println("*************获取公有字段**并调用***********************************");
        Field f = stuClass.getField("name");
        System.out.println(f);
        System.out.println();

        //获取一个对象
        Object obj = stuClass.getConstructor().newInstance();
        f.set(obj,"周杰伦");
        Student stu = (Student)obj;
        System.out.println(stu.name);
        System.out.println();

        System.out.println("**************获取私有字段****并调用********************************");
        f = stuClass.getDeclaredField("phoneNum");
        System.out.println(f);
        f.setAccessible(true);//暴力反射，解除私有限定
        f.set(obj,"1313333333");
        System.out.println(stu);

    }
}
