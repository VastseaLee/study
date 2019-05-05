package designPattern.creationalPattern.singletonPattern;

/**
 * 双检锁/双重校验锁
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking singleton;
    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getSingleton() {
        if(singleton == null){
            synchronized (DoubleCheckedLocking.class){
                if(singleton == null){
                    singleton = new DoubleCheckedLocking();
                }
            }
        }
        return singleton;
    }
}
