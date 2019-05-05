package logic;

public class ChickenRabbit {
    public static void main(String[] args){
        chickenRabbit(201,604);
    }

    public static String chickenRabbit(int headNum,int footNum){
        int rabbitNum = footNum/2-headNum;
        int chickenNum = headNum - rabbitNum;
        System.out.println("有兔子"+rabbitNum+"只");
        System.out.println("有鸡"+chickenNum+"只");
        return (footNum%2==0 && rabbitNum>0)?"0":"-1";
    }
}
