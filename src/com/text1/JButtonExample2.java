package com.text1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class JButtonExample2  extends WindowAdapter implements ActionListener{
    //定义需要的组件
    JFrame f;
    JScrollPane jScrollPane; //定义滚动面板
    JPanel p;
    JButton b1, b2, b3;
    JTextArea tf;

    int tag = 0;
    String s1 = "You have pressed the \"Sample\" button!";


    public static void main(String[] args){
        JButtonExample2 be = new JButtonExample2();
        be.go();
    }

    public void go(){
        f = new JFrame("JBtton Example2"); //创建

        Border border = BorderFactory.createTitledBorder("jScroll");
        tf = new JTextArea(0, 20);
        jScrollPane  = new JScrollPane(tf);
        jScrollPane.setBorder(border);
        f.getContentPane().add(jScrollPane, BorderLayout.CENTER);

        //创建Button并设置：起名，注册快捷键，设置事件命令，注册事件监听
        b1 = new JButton("Sample");
        b1.setMnemonic(KeyEvent.VK_S);
        b1.setActionCommand("Sample");
        b1.addActionListener(this);
        //对b2也是如此
        b2 = new JButton("Disable Sample");
        b2.setMnemonic(KeyEvent.VK_A);
        b2.setActionCommand("Disable");
        b2.addActionListener(this);
        //对b3也是如此
        b3 = new JButton("Exit");
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("Exit");
        b3.addActionListener(this);

        //面板
        p = new JPanel();
        p.setBackground(Color.darkGray);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        f.getContentPane().add(p, BorderLayout.SOUTH);


        //最后对顶层容器进行常规设置
        f.addWindowListener(this);
        f.setBounds(300, 10, 500, 300);
        f.setVisible(true);
    }

    //按钮别点击时的响应函数。
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() == "Sample"){
            ++tag;
            tf.append(s1 + "  " + tag + "  times !\n" );
        }
        if(e.getActionCommand() == "Disable"){
            b1.setEnabled(false);
            b2.setText("Enable Sample");
            b2.setActionCommand("Enable");
            tf.append("You haved press \"Disable Sample\" ,So the \"Sample\" button can't be pressed!\n");
        }
        if(e.getActionCommand() == "Enable"){
            b1.setEnabled(true);
            b2.setText("Disable Sample");
            b2.setActionCommand("Disable");
            tf.append("You haved press \"Enable Sample\", So the \" Sample\" button can be pressed !\n");
        }
        if(e.getSource() == b3){
            System.exit(0);
        }
    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
