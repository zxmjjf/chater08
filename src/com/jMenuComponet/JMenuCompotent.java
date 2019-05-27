package com.jMenuComponet;

import com.jMenuComponet.menuPackage.EditMenu;
import com.jMenuComponet.menuPackage.FileMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class JMenuCompotent {
    JFrame jFrame = new JFrame("Menu Demo");
    JMenuBar jMenuBar = new JMenuBar();

    public static void main(String[] args) {
        JMenuCompotent jMenuCompotent = new JMenuCompotent();
        jMenuCompotent.go();
    }
    public void  go(){
        jMenuBar.setBorderPainted(true);
        jMenuBar.setBackground(Color.WHITE);

        jFrame.setJMenuBar(jMenuBar);

        FileMenu fileMenu = new FileMenu();
        EditMenu editMenu = new EditMenu();

        JMenu jMenu3 = new JMenu("View");
        jMenu3.setMnemonic(KeyEvent.VK_V);
        JMenu jMenu4 = new JMenu("Navigate");
        jMenu4.setMnemonic(KeyEvent.VK_N);
        JMenu jMenu5 = new JMenu("Code");
        jMenu5.setMnemonic(KeyEvent.VK_C);
        JMenu jMenu6 = new JMenu("Analyze");
        jMenu6.setMnemonic(KeyEvent.VK_A);
        JMenu jMenu7 = new JMenu("Refactor");
        jMenu7.setMnemonic(KeyEvent.VK_R);
        JMenu jMenu8 = new JMenu("Build");
        jMenu8.setMnemonic(KeyEvent.VK_B);
        JMenu jMenu9 = new JMenu("Run");
        jMenu9.setMnemonic(KeyEvent.VK_U);
        JMenu jMenu10 = new JMenu("VCS");
        jMenu10.setMnemonic(KeyEvent.VK_S);
        JMenu jMenu11 = new JMenu("Window");
        jMenu11.setMnemonic(KeyEvent.VK_W);
        JMenu jMenu12 = new JMenu("Help");
        jMenu12.setMnemonic(KeyEvent.VK_H);


        jMenuBar.add(fileMenu.getjMenu());
        jMenuBar.add(editMenu.getjMenu());
        jMenuBar.add(jMenu3);
        jMenuBar.add(jMenu4);
        jMenuBar.add(jMenu5);
        jMenuBar.add(jMenu6);
        jMenuBar.add(jMenu7);
        jMenuBar.add(jMenu8);
        jMenuBar.add(jMenu9);
        jMenuBar.add(jMenu10);
        jMenuBar.add(jMenu11);
        jMenuBar.add(jMenu12);

        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
        jFrame.setBounds(300, 50, 800, 550);
    }
}
