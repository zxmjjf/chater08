package com.fontDesign;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FontDesign implements ActionListener {
    JFrame frame;
    JButton jButton;
    JTextArea textArea;
    JScrollPane jScrollPane;

    public static void main(String[] args){
        FontDesign fontDesign = new FontDesign();
        fontDesign.go();
    }
    public void go(){
        frame = new JFrame("Font Design Demo");
        Container contentPane = frame.getContentPane();
        jButton = new JButton("Get Available Font Family Names");

        //设置按钮的前景色，背景色和字体
        jButton.setForeground(Color.blue);
        jButton.setBackground(Color.GREEN);
        Font font = new Font("华文行楷", Font.BOLD + Font.ITALIC, 18);
        jButton.setFont(font);

        jButton.addActionListener(this);
        contentPane.add(jButton, BorderLayout.SOUTH);

        textArea = new JTextArea();

        //设置文本区的前景色，背景色和字体
        textArea.setForeground(Color.blue);
        textArea.setBackground(Color.GREEN);
        font = new Font("Dialog", Font.BOLD, 14);
        textArea.setFont(font);

        jScrollPane = new JScrollPane(textArea);
        contentPane.add(jScrollPane);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setBounds(500, 50, 700, 550);
    }

    public void actionPerformed(ActionEvent e){
        textArea.setText("");
        String[] fontFamilyNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        textArea.setText("number = " + fontFamilyNames.length + "\n");
        for (int i = 0; i < fontFamilyNames.length; ++i) {
            textArea.append(fontFamilyNames[i] + "\n");
        }

    }
}
