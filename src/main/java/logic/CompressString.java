package logic;

import com.sun.deploy.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

public class CompressString {
    public static void main(String[] args){
        compressStr("aaaabbbccdesg");

    }
    public static void compressStr(String str){
        String s = "";
        char temp;
        for (int i = 0; i < str.length()-1;) {
            int num = 1;
            temp = str.charAt(i);
            s += temp;
            while(temp==str.charAt(++i)){
                num++;
                if(i==str.length()-1&&num>1) {
                    break;
                }
            }
            if(i==str.length()-1 && num==1) {
                s += str.charAt(i);
            }
            if(num >1) {
                s += num;
            }
        }
        System.out.println(s);
    }
}
