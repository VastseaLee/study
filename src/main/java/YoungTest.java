import annotation.Yann;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

@Yann
public class YoungTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("l");
        user.setAge(0);
        change(user);
        System.out.println(user);
    }

    public static void change(User user) {
      for(int i=100;;i++){
          for (int j=10;j<i;j++){
              if(i/j == j){

              }
          }
      }
    }
}
