package com.layoutPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NoLayout {
    JFrame jFrame = new JFrame("No Layout Demo");
    JButton jButton,jButton1, jButton2, jButton3;

    public static void main(String[] args) {
        NoLayout noLayout = new NoLayout();
        noLayout.go();
    }
    public void go(){
        Container contentPane = jFrame.getContentPane();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        contentPane.add(jPanel);
        jButton1 = new JButton("按钮1");
        jButton2 = new JButton("按钮2");
        jButton3 = new JButton("按钮3");

        jButton1.setBounds(0, 0,100, 40);
        jButton2.setBounds(150,60,100, 40);
        jButton3.setBounds(300,120,100, 40);

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        //处理按钮点击事件
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jButton != null){
                    jButton.setBackground(null);
                    jButton = (JButton)e.getSource();
                    jButton.setBackground(Color.BLUE);
                    System.out.println("点击了按钮");
                }else{
                    jButton = (JButton)e.getSource();
                    jButton.setBackground(Color.BLUE);
                    System.out.println("点击了按钮");
                }

            }
        };
        jButton1.addActionListener(actionListener);
        jButton2.addActionListener(actionListener);
        jButton3.addActionListener(actionListener);

        //为面板添加鼠标点击事件
        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jButton != null) {
                    super.mouseClicked(e);
                    int x = e.getX();
                    int y = e.getY();
                    jButton.setBounds(x, y, 100, 40);
                    System.out.println("点击了面板");
                }
            }
        });

        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(500, 20, 800, 600);
        jFrame.setVisible(true);
    }
}
