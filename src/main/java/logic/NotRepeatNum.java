package logic;

public class NotRepeatNum {
    public static void main(String[] args){
        getNotRepeatNum(21099);
    }
    public static void getNotRepeatNum(int n){
        int i = n+1;
        for (; i < 100000; i++) {
            boolean flag = true;
            String num = String.valueOf(i);
            for (int j = 0; j < num.length()-1; j++) {
                if(num.charAt(j)==num.charAt(++j)){
                    flag = false;
                    break;
                }
                j--;
            }
            if(flag){
                break;
            }
        }
        if(i==100000) {
            System.out.println("没有");
        } else {
            System.out.println(i);
        }
    }
}
