package logic;

public class PointSoldier {
    public static void main(String[] args){
        for (int i = 5; i < 100; i++) {
            if(i%3==1 && i%7==5 && i%5==0){
                System.out.println("有兵"+i+"人");
            }
        }
    }
}
