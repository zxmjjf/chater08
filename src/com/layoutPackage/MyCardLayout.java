package com.layoutPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCardLayout {
    CardLayout myCard = new CardLayout(20, 20);
    JFrame jFrame = new JFrame();
    Container contentPane;

    public static void main(String[] args) {
        MyCardLayout myCardLayout = new MyCardLayout();
        myCardLayout.go();
    }
    public void go(){
        //准备组件
        JPanel jPanel, jPanel1, jPanel2, jPanel3;
        JButton jButton, jButton1, jButton2, jButton3;

        //设置内容窗格的布局管理器为CardLayout
        contentPane = jFrame.getContentPane();
        contentPane.setLayout(myCard);

        //创建面板主键
        jPanel = new JPanel(); //第一张
        jPanel.setBackground(Color.BLACK); //黑色
        jPanel1 = new JPanel(); //第二张
        jPanel1.setBackground(Color.RED); //红色
        jPanel2 = new JPanel(); //第三张
        jPanel2.setBackground(Color.CYAN);  //淡蓝色
        jPanel3 = new JPanel(); //第四张
        jPanel3.setBackground(Color.YELLOW); //黄色

        //创建按钮
        Font font = new Font("华文行楷", Font.BOLD + Font.ITALIC, 30); //用于设置按钮的字体
        jButton = new JButton("第一张");
        jButton.setFont(font);
        jButton.setForeground(Color.BLACK);
        jButton1 = new JButton("第二张");
        jButton1.setFont(font);
        jButton1.setForeground(Color.RED);
        jButton2 = new JButton("第三张");
        jButton2.setFont(font);
        jButton2.setForeground(Color.CYAN);
        jButton3 = new JButton("第四张");
        jButton3.setFont(font);
        jButton3.setForeground(Color.YELLOW);

        //将面板置于contentPane中
        contentPane.add(jPanel);
        contentPane.add(jPanel1);
        contentPane.add(jPanel2);
        contentPane.add(jPanel3);
        //将按钮置于面板中
        jPanel.add(jButton);
        jPanel1.add(jButton1);
        jPanel2.add(jButton2);
        jPanel3.add(jButton3);

        //为按钮注册事件


        //显示最后一张卡片
        myCard.last(contentPane);

        //定义一个事件的内部类。以便处理捕获的事件
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //当事件发生时，显示下一张卡片
                myCard.next(contentPane);
            }
        };

        //为button注册事件，注意此时只能在listener之后注册，因为listener是累不累，不用在之前使用。
        jButton.addActionListener(listener);
        jButton1.addActionListener(listener);
        jButton2.addActionListener(listener);
        jButton3.addActionListener(listener);

        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(500, 50, 700, 550);
        jFrame.setVisible(true);
    }
}
