package com.text1;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.security.cert.CertificateParsingException;

public class JLableDemo {
    JFrame jFrame = new JFrame("JLableDemo");
    Container contentPane = jFrame.getContentPane();
    JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5;
    Border etche = BorderFactory.createEtchedBorder(0, Color.BLUE, Color.RED);
    Border border1, border2, border3, border4, border5;
    GridLayout gridLayout = new GridLayout(1,1);

    public static void main(String[] args){
        JLableDemo jLableDemo = new JLableDemo();
        jLableDemo.go();
    }

    public void go(){
        jLabel1 = new JLabel("Only Text Label");
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(gridLayout);
        border1 = BorderFactory.createMatteBorder(2, 6, 7, 2, Color.RED);
        jPanel1.setBorder(border1);
        jPanel1.add(jLabel1);

        jLabel2 = new JLabel("Right Label", JLabel.RIGHT);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(gridLayout);
        border2 = BorderFactory.createTitledBorder(etche, "jLabel2", 2, 2);
        ((TitledBorder) border2).setTitleColor(Color.green);
        //border = BorderFactory.createEmptyBorder()
        jPanel2.setBorder(border2);
        jPanel2.add(jLabel2);

        Icon icon = new ImageIcon("");
        jLabel3 = new JLabel(icon);
        jLabel3.setVerticalAlignment(JLabel.BOTTOM);
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(gridLayout);
        border3 = BorderFactory.createBevelBorder(0, Color.GREEN, Color.BLUE, Color.GREEN, Color.BLUE);
        //((TitledBorder) border).setTitleColor(Color.RED);
        jPanel3.setBorder(border3);
        jPanel3.add(jLabel3);

        jLabel4 = new JLabel("Image and Text", icon, JLabel.LEFT);
        jLabel4.setVerticalAlignment(JLabel.TOP);
        jLabel4.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel4.setHorizontalTextPosition(JLabel.CENTER);
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(gridLayout);
        border4 = BorderFactory.createCompoundBorder(border3, border2);
        //border4 = BorderFactory.createTitledBorder(etche, "jLabel4");
        jPanel4.setBorder(border4);
        jPanel4.add(jLabel4);

        jLabel5 = new JLabel("Input your name here");
        JTextField nameField = new JTextField(12);
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayout(1,2));
        border5 = BorderFactory.createTitledBorder("jLabel5");
        jPanel5.setBorder(border5);
        jPanel5.add(jLabel5);
        jPanel5.add(nameField);

        contentPane.setLayout(new GridLayout(5, 1));
        contentPane.add(jPanel1);
        contentPane.add(jPanel2);
        contentPane.add(jPanel5);
        contentPane.add(jPanel3);
        contentPane.add(jPanel4);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 800);
        jFrame.setVisible(true);
    }
}
