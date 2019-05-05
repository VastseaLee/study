package reflect;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class stuClass = Class.forName("Student");

        //获取main方法
        Method mMain = stuClass.getMethod("main",String[].class);
        //调用main方法
//        mMain.invoke(null,new String[]{"a","b","c"});
        //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数
        //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。。。所以需要将它强转
//        mMain.invoke(null,(Object)new String[]{"a","b","c"});//方式一
        mMain.invoke(null,new Object[]{new String[]{}});//方式二
    }

}
