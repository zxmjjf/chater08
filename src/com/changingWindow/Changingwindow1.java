package com.changingWindow;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Changingwindow1 {
    JFrame jFrame = new JFrame("Changing window");
    JMenuBar jMenuBar = new JMenuBar();
    Container contentPane = jFrame.getContentPane();
    Window1 window1;
    Window2 window2;
    Changingwindow1(){
        jMenuBar.setBackground(Color.CYAN);
        jFrame.setJMenuBar(jMenuBar);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(500, 50, 700, 550);
    }
    public static void main(String[] args) {
        Changingwindow1 changingwindow1 = new Changingwindow1();
        changingwindow1.go();
    }
    public void go(){
        createMenu1();
        createMenu2();
        createMenu3();

        //showWindow2();
        //showWindow1();
    }
    public void createMenu1(){
        JMenu jMenu = new JMenu("Window1");  //1>
        jMenu.setMnemonic(KeyEvent.VK_1);
        jMenu.setBorderPainted(false);

        JMenuItem jMenuItem = new JMenuItem("Get in Window1");
        jMenuItem.setMnemonic(KeyEvent.VK_G);
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //showWindow1();
                System.out.println("点击Window1的选项");
                //window1.setViseable(true);
                //window2.setViseable(false);
                showWindow1();
            }
        });
        jMenu.add(jMenuItem);

        jMenuBar.add(jMenu);
    }
    public void createMenu2(){
        JMenu jMenu = new JMenu("Window2");  //1>
        jMenu.setMnemonic(KeyEvent.VK_2);
        jMenu.setBorderPainted(false);

        JMenuItem jMenuItem = new JMenuItem("Get in Window2");
        jMenuItem.setMnemonic(KeyEvent.VK_G);
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //showWindow2();
                //System.out.println("In Window 2");
                window2.setViseable(true);
                window1.setViseable(false);
            }
        });
        jMenu.add(jMenuItem);

        jMenuBar.add(jMenu);
    }
    public void createMenu3(){
        JMenu jMenu = new JMenu("Window3");  //1>
        jMenu.setMnemonic(KeyEvent.VK_3);
        jMenu.setBorderPainted(false);

        JMenuItem jMenuItem = new JMenuItem("Get in Window3");
        jMenuItem.setMnemonic(KeyEvent.VK_G);
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window1.setViseable(false);
                window2.setViseable(false);
            }
        });
        jMenu.add(jMenuItem);

        jMenuBar.add(jMenu);
    }
    public void showWindow1(){
        window1 = new Window1();
        contentPane.add(window1.getjPanel());
    }
    public void showWindow2(){
        window2 = new Window2();
        contentPane.add(window2.getjPanel());
    }

}


