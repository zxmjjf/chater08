package com.jlist;

import com.sun.source.doctree.AttributeTree;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JListDemo {
    JFrame jFrame = new JFrame("JList Demo");
    JList list; //相关
    DefaultListModel listModel; //相关
    JPanel panel;
    JTextField textField;
    JButton button;

    public static void main(String[] args) {
        JListDemo jListDemo = new JListDemo();
        jListDemo.go();
    }

    public void go(){

        listModel = new DefaultListModel(); //重要
        //添加可选项
        listModel.addElement("one");
        listModel.addElement("two");
        listModel.addElement("three");
        listModel.addElement("four");

        list = new JList(listModel); //重要
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //在设置选择模式时，一定要保证list有可选项，不让会出现异常

        //将列表放置于滚动窗格
        JScrollPane jScrollPane = new JScrollPane(list); //将list置于滚动面板中

        Container contentPane = jFrame.getContentPane(); //
        contentPane.add(jScrollPane);

        textField = new JTextField(15);
        button = new JButton("add new item");
        button.setMnemonic(KeyEvent.VK_A); //设置快捷键
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(textField.getText());
                textField.setText("");
            }
        });

        panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        contentPane.add(panel, BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocation(500, 110);
        jFrame.setVisible(true);
    }


}
