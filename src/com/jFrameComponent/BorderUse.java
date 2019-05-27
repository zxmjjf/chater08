package com.jFrameComponent;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BorderUse {
    JFrame jFrame = new JFrame("BorderUse");
    Container contentPane = jFrame.getContentPane();

    public static void main(String[] args) {
        BorderUse borderUse = new BorderUse();
        borderUse.go();
    }

    public void go() {
        contentPane.setLayout(new GridLayout(5, 2));

        Border border = BorderFactory.createBevelBorder(1);
        Border border1 = BorderFactory.createTitledBorder(border, "Bevel Border");
        JPanel jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border1);
        JTextArea textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建只有一个参数的Bevel Border, \n参数：0，1，2；对应：突起，凹陷，平");

        border = BorderFactory.createBevelBorder(0, Color.magenta, Color.GREEN);
        Border border2 = BorderFactory.createTitledBorder(border, "Bevel Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border2);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Bevel Border,第一个颜色对应左上两边，\n第二个颜色对应右下两边，此外还可以有四种颜色");

        border = BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE);
        Border border3 = BorderFactory.createTitledBorder(border, "Matte Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border3);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Mette Border ,前面四个参数\n分别对应四条边框的宽度,上左下右四边，颜色可以用图标代替");

        border = BorderFactory.createMatteBorder(10,20, 30, 40, Color.BLUE);
        Border border4 = BorderFactory.createTitledBorder(border, "Matte Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border4);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Mette Border ,前面四个参数10，20，30，40");

        border = BorderFactory.createLineBorder(Color.BLACK, 7, false);
        Border border5 = BorderFactory.createTitledBorder(border, "Line Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border5);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Line Border ,可以有1 or 2 or 3个参数\n，第一个颜色，第二个宽度，第三个是否有圆角:此时为false");

        border = BorderFactory.createCompoundBorder(border1, border3);
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Compound Border ,组合第1和第3个边框：");

        GradientPaint gradientPaint = new GradientPaint(200f, 15f, Color.GREEN, 350, 15f, Color.RED, false);
        border = BorderFactory.createDashedBorder(gradientPaint, 10f, 10);
        Border border7 = BorderFactory.createTitledBorder(border, "Dashed Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border7);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("创建有颜色的Dashed Border ,有3参数：\n第一实现Paint的对象，第二虚线的长，第三虚线之间的宽");


        border = BorderFactory.createDashedBorder(Color.CYAN, 15f, 10);
        Border border8 = BorderFactory.createTitledBorder(border, "Dashed Border");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border8);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("此时Dashed的第一个参数是Color的静态数据成员\nColor.CYNA，第7个实例是渐变的Paint对象");

        Border border9 = BorderFactory.createTitledBorder("OnlyTitle Botter");
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border9);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("上面的所以实例中都只用其他Border，然后\n再嵌入到Title Border 中，以达到有title\n的目的，此例是title的真面目");

        Border border10 = BorderFactory.createTitledBorder("OnlyTitle Botter");
        ((TitledBorder) border10).setTitleColor(Color.RED);
        jPanel1 = new JPanel();
        contentPane.add(jPanel1);
        jPanel1.setBorder(border10);
        textArea = new JTextArea(0,10);
        jPanel1.add(textArea);
        textArea.setText("当Title Border和其他Border，一起使用时，\n还可以有最多6参数，参数3，4表示位置，\n参数5表示字体，最后表示字体颜色\n");
        textArea.append("第五个参数字体，可以用setTitleColer函数修改颜色\n第六个参数也是可以修改的");


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1200, 800);
        jFrame.setVisible(true);
    }


}