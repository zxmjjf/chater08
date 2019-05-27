package com.jlist;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo2 {
    private JFrame jFrame = new JFrame("JList Demo 2");
    private Container contentPane;
    private JList jList;
    private DefaultListModel defaultListModel;
    String values = "";

    private JTextArea textArea = new JTextArea(5, 10);
    private JTextField jTextField = new JTextField(10);
    private JButton jButton = new JButton("add new item");

    public static void main(String[] args) {
        JListDemo2 jListDemo2 = new JListDemo2();
        jListDemo2.go();
    }

    private void go(){
        contentPane = jFrame.getContentPane();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1,2));
        //创建列表
        defaultListModel = new DefaultListModel();
        defaultListModel.addElement("one");
        defaultListModel.addElement("two");
        defaultListModel.addElement("three");
        jList = new JList(defaultListModel);
        Border bevel = BorderFactory.createBevelBorder(0);
        Border jPanelBorder = BorderFactory.createTitledBorder(bevel, "List Item");
        ((TitledBorder) jPanelBorder).setTitleColor(Color.RED);
        JScrollPane jScrollPane = new JScrollPane(jList);
        JButton jButton1 = new JButton("Commit");
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jScrollPane);
        jPanel1.add(jButton1, BorderLayout.SOUTH);
        jPanel1.setBorder(jPanelBorder);

        jPanel.add(jPanel1);

        //jTextArea部分
        jScrollPane = new JScrollPane(textArea);
        bevel = BorderFactory.createBevelBorder(0);
        jPanelBorder = BorderFactory.createTitledBorder(bevel, "All operations");
        ((TitledBorder) jPanelBorder).setTitleColor(Color.RED);
        jScrollPane.setBorder(jPanelBorder);
        jPanel.add(jScrollPane, BorderLayout.EAST);

        contentPane.add(jPanel);

        //处理下面的组件：jtextField 和 jButton
        jPanel = new JPanel();
        bevel = BorderFactory.createBevelBorder(0);
        jPanelBorder = BorderFactory.createTitledBorder(bevel, "Add new Item");
        ((TitledBorder) jPanelBorder).setTitleColor(Color.RED);
        jPanel.setBorder(jPanelBorder);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        contentPane.add(jPanel, BorderLayout.SOUTH);

        //注册事件监听
        //button事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultListModel.addElement(jTextField.getText());
                textArea.append("You add new Item on List:  " + jTextField.getText() +  "  (Contrast the left column)" + "\n");
                jTextField.setText("");
            }
        });
        //button1事件
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //defaultListModel.addElement(jTextField.getText());
                textArea.append("Your final choice is:  " + values + "\n");
            }
        });
        //list事件
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    Object[] objects = jList.getSelectedValues();
                    values = "";
                    for (int i = 0; i < objects.length; ++i) {
                        values = values + objects[i] + "  ";
                    }
                    textArea.append("In List Item, you selected : " + values + "\n");
                }
            }
        });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(400,50,700,550);
    }
}




