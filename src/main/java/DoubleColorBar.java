import java.util.*;

public class DoubleColorBar {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        while (set.size() < 6) {
            set.add((int) (Math.random() * 33) + 1);
        }
        System.out.println(set);
        System.out.println((int) (Math.random() * 16) + 1);
    }
}
