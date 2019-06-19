import annotation.Yann;

import java.lang.ref.PhantomReference;
import java.util.*;
import java.util.regex.Pattern;


@Yann
public class YoungTest {
    int a;

    public static void main(String[] args) {
        String date = new StringBuilder("2019-05-12").append(" ").toString();
        System.out.println(date+"00:00:00");
    }


}

class MyMap extends LinkedHashMap {
    private final int MAX_SIZE;

    public MyMap(int initialCapacity) {
        super(initialCapacity, 0.75f, true);
        MAX_SIZE = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_SIZE;
    }
}