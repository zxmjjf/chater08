package com.text1;

import java.awt.*;
import java.awt.event.*;

public class MyFrame  extends WindowAdapter{
    Frame frame;
    MyFrame(){
        frame = new Frame();
        frame.setBounds(50, 50, 500, 600);
        frame.setBackground(Color.RED);

        frame.addWindowListener(this);
        frame.setVisible(true);
    }
    MyFrame(String string){
        this();
        frame.setBounds(600, 50, 500, 600);
        frame.setName(string);
        //frame.removeNotify();
    }
    static void MyFrameText(){
        MyFrame myFrame = new MyFrame();
    }
    static void MyFrameText(String string){
        MyFrame myFrame = new MyFrame(string);
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("程序退出！！");
        System.exit(0);
    }
}
