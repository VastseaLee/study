import java.lang.reflect.Field;

public class Clazz {
    public static void main(String[] args) {
        Integer a = 5,b= 6;
        saop(a,b);
        System.out.println(a+" "+ b);

    }

    public static void saop(Integer A,Integer B){
        Field field = null;
        try {
            field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            Integer temp = new Integer(A);
            field.setInt(A,B);
            field.setInt(B,temp);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
