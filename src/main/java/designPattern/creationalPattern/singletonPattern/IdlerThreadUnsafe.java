package designPattern.creationalPattern.singletonPattern;

/**
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * <p>
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 */
public class IdlerThreadUnsafe {
    private static IdlerThreadUnsafe singleton;

    private IdlerThreadUnsafe() {
    }

    public static IdlerThreadUnsafe getSingleton() {
        if (singleton == null) {
            singleton = new IdlerThreadUnsafe();
        }
        return singleton;
    }
}
