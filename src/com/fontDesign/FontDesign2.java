package com.fontDesign;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class FontDesign2{
    JFrame jFrame = new JFrame("All Font"); //顶层窗口
    Container contentPane;

    JList jList;  //这是一个列表组件，每一项都是字体的名称
    String[] strings; //存放所有字体的数组
    Font font; // 字体的引用变量

    JTextArea jTextArea; //用于显示字体的式样文本

    Border border, border1; //为图形界面的组件设置边框

    public static void main(String[] args) {
        FontDesign2 fontDesign2 = new FontDesign2();
        fontDesign2.go();
    }

    public void go(){
        contentPane = jFrame.getContentPane();

        //字体名称列表
        strings = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();  //用strings数组存储所有字体名称
        jList = new JList(strings);

        //处理字体的名称
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //设置字体单选，即一次只能查看一个字体
        JScrollPane jScrollPane = new JScrollPane(jList); //将列表置于滚动面板中，常规操作
        jList.setForeground(Color.BLUE); //设置字体前景色，即列表项的文字的颜色：蓝色
        jList.setBackground(Color.WHITE); //背景色：白色
        //设置边框
        GradientPaint gradientPaint = new GradientPaint(200f, 15f, Color.GREEN, 350, 15f, Color.RED, false);
        border = BorderFactory.createDashedBorder(gradientPaint, 10f, 10);
        border1 = BorderFactory.createTitledBorder(border, "字体名称");
        ((TitledBorder) border1).setTitleColor(Color.MAGENTA); //设置边框名称的字体颜色
        jScrollPane.setBorder(border1);//滚动面板添加边框

        //文本区模块的处理
        jTextArea = new JTextArea(30,20);  //由于最终放置再滚动面板中，可以不设置参数
        jTextArea.setBackground(Color.WHITE); //背景色
        jTextArea.setForeground(Color.RED);     //前景色
        JScrollPane jScrollPane1 = new JScrollPane(jTextArea); //将文本区置于滚动组件中
        //设置边框
        gradientPaint = new GradientPaint(200f, 15f, Color.GREEN, 350, 15f, Color.RED, false);
        border = BorderFactory.createDashedBorder(gradientPaint, 10f, 10);
        border1 = BorderFactory.createTitledBorder(border, "字体式样");
        ((TitledBorder) border1).setTitleColor(Color.MAGENTA);
        jScrollPane1.setBorder(border1); //为面板添加边框

        //jList的选择事件的处理
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str =(String)jList.getSelectedValue(); //保留所选的列表项
                font = new Font(str, Font.BOLD + Font.ITALIC, 22); //新建字体
                ((TitledBorder) border1).setTitle("字体式样: " + str); //设置文本区边框的名称
                jTextArea.setFont(font); //设置文本区的字体
                //显示于文本区的内容
                jTextArea.setText(str + " 形式的字体：");
                jTextArea.append("\nEnglish: a b c d e g h i j k l  \n中文：这里是字体的式样");
            }
        });

        //布局两个面板
        contentPane.setLayout(new GridLayout(1, 2, 5, 5));
        contentPane.add(jScrollPane);
        contentPane.add(jScrollPane1);

        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(400, 50, 700, 500);
        jFrame.setVisible(true);
    }
}
