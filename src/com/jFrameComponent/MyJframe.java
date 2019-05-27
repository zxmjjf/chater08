package com.jFrameComponent;
import java.awt.*;
import javax.swing.*;

public class MyJframe{
    JFrame frame;
    Container contentPane;
    public MyJframe(String frameName){
        //最基本的两条语句
        frame = new JFrame(frameName);
        contentPane = frame.getContentPane();

        //内容窗格
        //contentPane.setBackground(Color.magenta);
        contentPane.setLayout(new BorderLayout()); //和默认一样


        //最后的设置，可选！
        frame.setBounds(810, 10, 700, 800); //(x,y)表示窗口最左上方的位置，(w,h)表示宽高；
        frame.setResizable(false);  //设置是否可以改变窗口的大小，默认为true表示可以改变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //设置窗口关闭时的操作，此时为退出程序
        frame.setVisible(true); //显示窗口
    }
    public  MyJframe(){
        this("no-name");
    }
    //·······

    //静态测试入口
    public static void MyJframeText(String string){//静态测试入口
        //
    }
}