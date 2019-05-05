package designPattern.creationalPattern.singletonPattern;

/**
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 *
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */

public class IdlerThreadSafe {
    private static IdlerThreadSafe singleton;

    private IdlerThreadSafe() {
    }
    public static synchronized IdlerThreadSafe getSingleton(){
        if(singleton == null) {
            singleton = new IdlerThreadSafe();
        }
        return singleton;
    }
}