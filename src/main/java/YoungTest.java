import annotation.Yann;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

@Yann
public class YoungTest {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 3, 1};
        Arrays.sort(ints);
        for (int i:ints){
            System.out.println(i);
        }
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
