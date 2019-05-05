package logic;

public class Hanoi {

    private static int moveCount;

    public static void main(String[] args){
        hanoi(5);
    }

    private static void hanoi(int n){
        char a = 'A';
        char b = 'B';
        char c = 'C';
        move(n,a,b,c);
        System.out.println("一共移动了"+moveCount+"步");
    }

    private static void move(int moveNum,char a,char b,char c){
        moveCount++;
        if(moveNum == 1){
            System.out.println("把第"+moveNum+"个盘子从"+a+"拿到"+c);
        }else{
            move(moveNum-1,a,c,b);//A借助C把n-1个盘子搬到B
            System.out.println("把第"+moveNum+"个盘子从"+a+"拿到"+c);
            move(moveNum-1,b,a,c);//B借助A把n-1个盘子搬到C
        }

    }
}
