package pet;

import javax.swing.*;

public class Pokemon {
//    private static Behave normalThread = null;
//    private static Behave eatThread = null;

    private String name;

//    public static Behave getNormalThread() {
//        return normalThread;
//    }
//
//    public static void setNormalThread(Behave normalThread) {
//        Pokemon.normalThread = normalThread;
//    }
//
//    public static Behave getEatThread() {
//        return eatThread;
//    }
//
//    public static void setEatThread(Behave eatThread) {
//        Pokemon.eatThread = eatThread;
//    }
    /**
     *初始化
     */
    private void init(JLabel label,String imgUrl){
        PhotoUtil.changeJLabelImg(label,imgUrl);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(String name) {
        this.name = name;
    }
}
