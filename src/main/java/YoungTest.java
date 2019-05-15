import annotation.Yann;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

@Yann
public class YoungTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(null);
        list.add(1);
        list.add(2);
        List<Integer> list1 = new ArrayList<>(list);
        List<Integer> list2 = new ArrayList<>(list);
        list1.add(3);
        System.out.println(list);

    }

    public static void change(User user) {
        for (int i = 100; ; i++) {
            for (int j = 10; j < i; j++) {
                if (i / j == j) {

                }
            }
        }
    }
}
