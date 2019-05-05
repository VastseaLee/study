package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class methodinter {

    public static void main(String[] args) {
        //消费型接口，有参无返回值
        Consumer<Integer> con = (x) -> System.out.println(x);
        con.accept(1);
        Consumer cons = System.out::println;
        cons.accept(2);
        System.out.println("-------------------------");

        //供给型接口，无参有返回值
        Supplier<String> sup = () -> new String("Hello");
        System.out.println(sup.get());
        Supplier<String> supp = String::new;
        String str = supp.get().replace("", "World");
        System.out.println(str);
        System.out.println("-------------------------");

        //函数式接口，有参有返回值
        Function<String, Integer> fun = (x) -> Integer.valueOf(x);//new Integer(x);
        System.out.println(fun.apply("2"));
        //这里要用这种写法需要有个符合的构造器
        Function<String, User> func = User::new;
        System.out.println(func.apply("Young"));
        //数组引用
        Function<Integer, List> arrF = ArrayList::new;
        Function<Integer, Integer[]> arrFu = (x) -> new Integer[x];
        //多参数
        BiFunction<String, String, Integer> biFun = (x, y) -> Integer.valueOf(x) + Integer.valueOf(y);
        BiFunction<String, String, Boolean> biFun2 = String::equals;
        System.out.println("-------------------------");

        //断言型接口，有参有返回值，返回值是boolean类型
        Predicate<Integer> pre = (x) -> x > 5;
        System.out.println(pre.test(6));
    }
}
