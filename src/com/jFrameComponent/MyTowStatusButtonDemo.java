package com.jFrameComponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyTowStatusButtonDemo {
    JFrame jFrame = new JFrame("ToStatusButtonDemo");
    Container contentPane = jFrame.getContentPane();
    FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 0);
    JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5;
    JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox7;
    JRadioButton jRadio1, jRadio2, jRadio3, jRadio4, jRadio5, jRadio6;
    JTextArea jTextArea = new JTextArea(0, 30);

    public static void main(String[] args){
        MyTowStatusButtonDemo that = new MyTowStatusButtonDemo();
        that.go();
    }
    public void go(){
        //第一组：jCheckBox
        jCheckBox1 = new JCheckBox("JCheckBox 1");
        jCheckBox2 = new JCheckBox("JCheckBox 2");
        jCheckBox3 = new JCheckBox("JCheckBox 3");
        jPanel1 = new JPanel();
        jPanel1.add(jCheckBox1);
        jPanel1.add(jCheckBox2);
        jPanel1.add(jCheckBox3);
        jPanel1.setLayout(flowLayout);
        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched, "JCheckBox");
        jPanel1.setBorder(border);

        //第二组：jCheckBox
        jCheckBox4 = new JCheckBox("JCheckBox 4");
        jCheckBox5 = new JCheckBox("JCheckBox 5");
        jCheckBox7 = new JCheckBox("JCheckBox 6");
        ButtonGroup group1 = new ButtonGroup();
        group1.add(jCheckBox1);
        group1.add(jCheckBox3);
        group1.add(jCheckBox7);
        jPanel2 = new JPanel();
        jPanel2.add(jCheckBox4);
        jPanel2.add(jCheckBox5);
        jPanel2.add(jCheckBox7);
        jPanel2.setLayout(flowLayout);
        jPanel2.setBackground(Color.pink);
        border = BorderFactory.createTitledBorder(etched, "JCheckBox Group");
        jPanel2.setBorder(border);

        //第三组：jRadiol
        jRadio1 = new JRadioButton("JRadioButton 1");
        jRadio2 = new JRadioButton("JRadioButton 2");
        jRadio3 = new JRadioButton("JRadioButton 3");
        jPanel3 = new JPanel();
        jPanel3.add(jRadio1);
        jPanel3.add(jRadio2);
        jPanel3.add(jRadio3);
        jPanel3.setLayout(flowLayout);
        jPanel3.setBackground(Color.cyan);
        border = BorderFactory.createTitledBorder(etched, "JRadiolButton");
        jPanel3.setBorder(border);

        //第四组：jRadio
        jRadio4 = new JRadioButton("JRadioButton 4");
        jRadio5 = new JRadioButton("JRadioButton 5");
        jRadio6 = new JRadioButton("JRadioButton 6");
        ButtonGroup group2 = new ButtonGroup();
        group2.add(jRadio4);
        group2.add(jRadio5);
        group2.add(jRadio6);
        jPanel4 = new JPanel();
        jPanel4.add(jRadio4);
        jPanel4.add(jRadio5);
        jPanel4.add(jRadio6);
        jPanel4.setLayout(flowLayout);
        jPanel4.setBackground(Color.BLUE);
        border = BorderFactory.createTitledBorder(etched, "JRadiolButton Group");
        jPanel4.setBorder(border);

        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        contentPane.add(jScrollPane, BorderLayout.CENTER);
        border = BorderFactory.createTitledBorder(etched, "Results");
        jScrollPane.setBorder(border);


        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox jCheckBox = (JCheckBox)e.getSource();
                if(jCheckBox == jCheckBox1){
                    jTextArea.append("You pressed \"JCheckBox 1\"   " + jCheckBox1.isSelected() + "\n");
                }else if(jCheckBox == jCheckBox2){
                    jTextArea.append("You pressed \"JCheckBox 2\"   " + jCheckBox2.isSelected() + "\n");
                }else if(jCheckBox == jCheckBox3){
                    jTextArea.append("You pressed \"JCheckBox 3\"   " + jCheckBox3.isSelected() + "\n");
                }else if(jCheckBox == jCheckBox4){
                    jTextArea.append("You pressed \"JCheckBox 4\"   " + jCheckBox4.isSelected() + "\n");
                }else if(jCheckBox == jCheckBox5){
                    jTextArea.append("You pressed \"JCheckBox 5\"   " + jCheckBox5.isSelected() + "\n");
                }else if(jCheckBox == jCheckBox7){
                    jTextArea.append("You pressed \"JCheckBox 6\"   " + jCheckBox7.isSelected() + "\n");
                }
            }
        };
        jCheckBox1.addItemListener(il);
        jCheckBox2.addItemListener(il);
        jCheckBox3.addItemListener(il);
        jCheckBox4.addItemListener(il);
        jCheckBox5.addItemListener(il);
        jCheckBox7.addItemListener(il);

        ItemListener al = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JRadioButton jRadio = (JRadioButton)e.getSource();
                if(jRadio == jRadio1){
                    jTextArea.append("You pressed \"jRadio 1\"  " + jRadio1.isSelected() + "\n");
                }else if(jRadio == jRadio2){
                    jTextArea.append("You pressed \"jRadio 2\"  " + jRadio2.isSelected() + "\n");
                }else if(jRadio == jRadio3){
                    jTextArea.append("You pressed \"jRadio 3\"  " + jRadio3.isSelected() + "\n");
                }else if(jRadio == jRadio4){
                    jTextArea.append("You pressed \"jRadio 4\"  " + jRadio4.isSelected() + "\n");
                }else if(jRadio == jRadio5){
                    jTextArea.append("You pressed \"jRadio 5\"  " + jRadio5.isSelected() + "\n");
                }else{
                    jTextArea.append("You pressed \"jRadio 6\"  " + jRadio6.isSelected() + "\n");
                }
            }
        };
        jRadio1.addItemListener(al);
        jRadio2.addItemListener(al);
        jRadio3.addItemListener(al);
        jRadio4.addItemListener(al);
        jRadio5.addItemListener(al);
        jRadio6.addItemListener(al);

        jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayout(4,0));
        jPanel5.add(jPanel1);
        jPanel5.add(jPanel2);
        jPanel5.add(jPanel3);
        jPanel5.add(jPanel4);
        contentPane.add(jPanel5, BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(800, 10, 600, 750);
        jFrame.setVisible(true);
    }
}
