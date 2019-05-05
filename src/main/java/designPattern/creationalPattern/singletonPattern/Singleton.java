package designPattern.creationalPattern.singletonPattern;

/**
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 *
 * 这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 */

public enum Singleton {
    SINGLETON;
    public void method(){

    }
}
