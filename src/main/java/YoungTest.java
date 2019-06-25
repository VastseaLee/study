import annotation.Yann;

import java.lang.ref.PhantomReference;
import java.util.*;
import java.util.regex.Pattern;


@Yann
public class YoungTest {
    int a = 20;

    public static void main(String[] args) {

    }

    public String showMap(Map map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> {
            sb.append(";");
            sb.append(k);
            sb.append(":");
            sb.append(v);
        });
        return sb.substring(1);
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