import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class  aaaaaa {
    volatile static Boolean flag = true;
    static int i = 0;
    final static ThreadLocal<HashMap> threadLocal = new ThreadLocal();
    public static void test() {
        new Thread() {
            @Override
            public void run() {
                while (i < 1000) {
                    if (flag) {
                        System.out.println("++" + i);
                        flag = false;

                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (i < 1000) {
                    if (!flag) {
                        System.out.println("--" + i++);
                        flag = true;
                    }
                }
            }
        }.start();
        Lock lock = new ReentrantLock();
    }

    public static void main(String[] args) {
        test();
    }
}
