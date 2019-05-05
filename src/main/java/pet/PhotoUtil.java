package pet;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PhotoUtil {

    static JLabel label;
    static boolean flag = true;
    static Point point;
    static JFrame frame;

    public static void main(String[] args) throws IOException, InterruptedException {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle rect = ge.getMaximumWindowBounds();
        int MAX_X = rect.width;
        int MAX_Y = rect.height;

        frame = new JFrame();
        Dimension dim = new Dimension();
        dim.setSize(140, 163);              //窗体的大小
        frame.setSize(dim);                //设置窗体大小
        frame.setType(JFrame.Type.UTILITY);//设置取消窗体任务栏图标
        label = loadPicture(0, 0, MainJframe.IMGPATH + "shime1.png");
        point = new Point(30, MAX_Y - 142);  // 设置坐标
        frame.setLocation(point);          //设置窗体坐标
        frame.setAlwaysOnTop(true);
        frame.setUndecorated(true); // 取消窗口标题栏
        frame.setBackground(new Color(0, 0, 0, 0));// 背景透明
        setTray();
        frame.add(label);
        frame.setVisible(true);
        boolean flag = true;
        while (true){
            if(point.x > 0 && (point.y==MAX_Y - 142 || point.y == MAX_Y - 124)){
                left();
            }
            if(point.x <= 0){
                up();
            }
        }
    }

    private static void up() throws InterruptedException {
        while (true){
            Thread.sleep(800);
            changeJLabelImg(label, MainJframe.IMGPATH + "shime12.png");
            point.y -= 10;
            if(flag){
                flag = false;
                point.x -= 45;
            }
            frame.setLocation(point);
            if(point.y <= 0){
                break;
            }
            Thread.sleep(800);
            changeJLabelImg(label, MainJframe.IMGPATH + "shime13.png");
            point.y -= 10;
            frame.setLocation(point);
            if(point.y <= 0){
                break;
            }
            Thread.sleep(800);
            changeJLabelImg(label, MainJframe.IMGPATH + "shime14.png");
            point.y -= 10;
            frame.setLocation(point);
            if(point.y <= 0){
                break;
            }
        }
    }

    /**
     * 窗口左移
     */
    private static void left() throws InterruptedException {
        while (true){
            Thread.sleep(800);
            changeJLabelImg(label, MainJframe.IMGPATH + "shime2.png");
            point.x -= 10;
            if(flag){
                point.y += 18;
                flag = false;
            }
            frame.setLocation(point);
            if(point.x <= -10){
                flag = true;
                break;
            }
            Thread.sleep(800);
            changeJLabelImg(label, MainJframe.IMGPATH + "shime3.png");
            point.x -= 10;
            frame.setLocation(point);
            if(point.x <= -10){
                flag = true;
                break;
            }
        }
    }







    /**
     * 加载图片
     *
     * @param x
     * @param y
     * @param url
     * @return
     */
    public static JLabel loadPicture(int x, int y, String url) {
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(url);
        int picWidth = icon.getIconWidth();
        int picHeight = icon.getIconHeight();
        icon.setImage(icon.getImage().getScaledInstance(picWidth, picHeight, Image.SCALE_DEFAULT));
        label.setBounds(x, y, picWidth, picHeight);
        label.setIcon(icon);
        return label;
    }

    /**
     * 给JLabel更换新图片
     */
    public static void changeJLabelImg(JLabel label, String imgUrl) {
        ImageIcon icon = new ImageIcon(imgUrl);
        int picWidth = icon.getIconWidth();
        int picpicHeight = icon.getIconHeight();
        label.setBounds(0, 0, picWidth, picpicHeight);
        label.setIcon(icon);
    }

    //设置托盘菜单
    private static void setTray() {
        if (SystemTray.isSupported()) {// 判断系统是否支持系统托盘
            SystemTray tray = SystemTray.getSystemTray(); // 获取当前系统的托盘

            // 为托盘添加一个右键弹出菜单
            PopupMenu popMenu = new PopupMenu();

            MenuItem itemOpen = new MenuItem("打开");
            itemOpen.addActionListener(e -> frame.setVisible(true));

            MenuItem itemHide = new MenuItem("隐藏");
            itemHide.addActionListener(e -> frame.setVisible(false));

            MenuItem itemExit = new MenuItem("退出");
            itemExit.addActionListener(e -> System.exit(0));

            popMenu.add(itemOpen);
            popMenu.add(itemHide);
            popMenu.add(itemExit);

            // 设置托盘图标
            ImageIcon icon = new ImageIcon(MainJframe.IMGPATH + "tray.jpg");
            Image image = icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT);

            TrayIcon trayIcon = new TrayIcon(image, "精灵宝可梦", popMenu);
            trayIcon.setImageAutoSize(true); // 自适应尺寸，这个属性至关重要

            try {
                tray.add(trayIcon);
            } catch (AWTException e1) {
                e1.printStackTrace();
            }
        }
    }
}
