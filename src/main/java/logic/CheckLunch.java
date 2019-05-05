package logic;

public class CheckLunch {
    public static void main(String[] args){
        checkLunch(11,4,new int[]{1,2,3,4,2,3,3,4,1,2,3});
    }
    public static void checkLunch(int num,int time,int[] input){
        int[] output = new int[num];
        for (int i = 0; i < num; i++) {
            if(input[i]==((i+1)%time==0?time:(i+1)%time)) {
                output[i] = input[i];
            }
        }
        for (int i:output){
            System.out.print(i+",");
        }
    }
}
