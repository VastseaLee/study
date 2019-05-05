package logic;


public class AutoComplete {
    public static void main(String[] args){
        autoComplete("beijing nanjing","jing");
    }
    public static void autoComplete(String str,String temp){
        String[] strs = str.split(" ");
        for (String s:strs){
            if(s.startsWith(temp)){
                System.out.print(s+" ");
            }
        }
    }
}
