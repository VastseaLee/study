package logic;

public class AttendMeeting {
    public static void main(String[] args){
        int a =-1,b=-1,c=-1,d=-1,e=-1,f=-1;
        Boolean flag = true;
        while(flag){
            a = (int)(Math.random()*2);
            if(a == 0){
                b = 1;
                e = 1;
                f = 1;
                d = 1;
            }else{
                d = 0;
                b = (int)(Math.random()*2);
                e = (int)(Math.random()*2);
                if(e == 0){
                    f = 1;
                }else{
                    f = 0;
                }
            }
            c = b;
           if(c!=d && (d==0&&e==0 || d==1)){
               flag = false;
           }
        }
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("C:"+c);
        System.out.println("D:"+d);
        System.out.println("E:"+e);
        System.out.println("F:"+f);
    }
}
