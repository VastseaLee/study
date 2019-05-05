package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
//        Class stuClass = Class.forName(getValue("className"));
//        Method m = stuClass.getMethod(getValue("methodName"));
//        m.invoke(stuClass.getConstructor().newInstance());


        //通过反射越过泛型检查
        ArrayList<String> al = new ArrayList<>();
        al.add("aaa");
        al.add("bbb");
        Class alClass = al.getClass();
        Method m = alClass.getMethod("add",Object.class);
        m.invoke(al,100);
        for(Object o:al){
            System.out.println(o);
        }
    }

    public static String getValue(String key) throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader("src/main/java/pro.txt");
        pro.load(fr);
        fr.close();
        return pro.getProperty(key);
    }
}
