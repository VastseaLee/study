package cossin;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


public class Cosine extends Applet {
    int x;
    int y;
    @Override
    public void start(){
        JFrame jf = new JFrame();
        jf.setSize(800, 800);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Graphics g = getGraphics();

        //画x轴
        for ( x = 0; x <= 750; x++) {
            g.drawString(".",x,200);
        }
        for( x = 740;x <= 750; x++){
            g.drawString("·",x,x-550); //x轴上方斜线
            g.drawString("·",x,950-x); //x轴下方斜线
        }

        //画y轴
        for(y=0;y<=385;y++){
            g.drawString(".",360,y);
        }
        for(y=375;y<=385;y++){
            g.drawString(".",y-25,y);//y轴左边斜线
            g.drawString(".",745-y,y);//y轴右边斜线
        }

        //画cos(x)曲线
        for(x=0;x<=720;x++){
            double a = Math.cos(x*Math.PI/180+Math.PI);
            y = (int)(200+80*a);
            g.drawString(".",x,y);
        }
    }
}
