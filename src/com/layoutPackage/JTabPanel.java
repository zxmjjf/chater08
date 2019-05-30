package com.layoutPackage;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.KeyEvent;

public class JTabPanel {
    JFrame jFrame = new JFrame("JTabPanel Demo");
    Container contentPane;
    JTabbedPane jTabbedPane;
    int jPanelLabNum = 6;

    //加于jTabbedPane的五张面板
    JPanel[] jPanels = new JPanel[5];

    public static void main(String[] args) {
        JTabPanel jTabPanel = new JTabPanel();
        jTabPanel.go();
    }

    public void go(){
        contentPane = jFrame.getContentPane();
        jTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        contentPane.add(jTabbedPane);

        designPanel();

        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
        jFrame.setBounds(500, 50, 700, 550);
    }

    protected void designPanel(){
        //创建面板
        jPanels[0] = new JPanel();
        jPanels[1] = new JPanel();
        jPanels[2] = new JPanel();
        jPanels[3] = new JPanel();
        jPanels[4] = new JPanel();

        //设置面板的背景色
        jPanels[0].setBackground(Color.RED);
        jPanels[1].setBackground(Color.BLUE);
        jPanels[2].setBackground(Color.GREEN);
        jPanels[3].setBackground(Color.YELLOW);
        jPanels[4].setBackground(Color.CYAN);

        //将面板加入jTabbedPanel中
        jTabbedPane.add("Panel 1", jPanels[0]);
        jTabbedPane.add("Panel 2", jPanels[1]);
        jTabbedPane.add("Panel 3", jPanels[2]);
        jTabbedPane.add("Panel 4", jPanels[3]);
        jTabbedPane.add("Panel 5", jPanels[4]);
        jTabbedPane.add("Lable 1", new JLabel("This is a  1 Lable"));
        Font font = new Font("华文彩云", Font.BOLD, 15);

        //设置标签页名字的字体
        jTabbedPane.setFont(font);

        //设置标签也对应的快捷键
        jTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        jTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        jTabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        jTabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        jTabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
        jTabbedPane.setMnemonicAt(5, KeyEvent.VK_6);

        //设置不可选中的标签页
        jTabbedPane.setEnabledAt(2, false); //设置3个标签页不可选

        //设置标签页的背景色
        jTabbedPane.setBackground(Color.BLACK);

        //设置标签页的前景色
        jTabbedPane.setForegroundAt(0, Color.RED);
        jTabbedPane.setForegroundAt(1, Color.BLUE);
        jTabbedPane.setForegroundAt(2, Color.GREEN);
        jTabbedPane.setForegroundAt(3, Color.YELLOW);
        jTabbedPane.setForegroundAt(4, Color.CYAN);
        jTabbedPane.setForegroundAt(5, null);

        //设置标签面板的changeListener,注册事件
        jTabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("这是第：" + (jTabbedPane.getSelectedIndex() + 1) + "  个标签页: " );
            }
        });

    }

}
