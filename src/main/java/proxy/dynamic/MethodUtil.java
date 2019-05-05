package proxy.dynamic;

public class MethodUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start(){
        tl.set(System.currentTimeMillis());
    }

    public static void finish(String methodName){
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName+"方法耗时:"+(finishTime-tl.get())+"ms");
    }
}
