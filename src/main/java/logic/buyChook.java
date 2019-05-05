package logic;

public class buyChook {
    public static void main(String[] args){
        int money;
        for (int mc=0; mc < 20; mc++) {
            money = 100;
            money -= mc * 5;
            for(int wc=0;wc<money/3;wc++){
                if(mc+wc+(money-wc*3)*3 == 100 && money >= 0){
                    System.out.print("公鸡："+mc+"只"+" ");
                    System.out.print("母鸡："+wc+"只"+" ");
                    System.out.print("小鸡："+(money-wc*3)*3+"只"+" ");
                    System.out.println();
                }
            }
        }
    }
}
