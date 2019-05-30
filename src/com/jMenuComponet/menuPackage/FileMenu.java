package com.jMenuComponet.menuPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class FileMenu {
    private JMenu jMenu = new JMenu("File");
    public FileMenu(){
        jMenu.setMnemonic(KeyEvent.VK_F);
    }
    public JMenu getjMenu(){
        inNewMenu();
        inOpenMenu();
        inOpenRecentMenu();
        inClossProjectMenu();
        jMenu.addSeparator();
        inSettingMenu();
        return jMenu;
    }
    public void inNewMenu(){
        JMenu jMenu1 = new JMenu("New");//1>
        jMenu1.setMnemonic(KeyEvent.VK_N);
        jMenu1.setToolTipText("Ctrl+N");

        JMenuItem jMenuItem = new JMenuItem("Project...."); //1_1)
        jMenu1.add(jMenuItem);

        jMenuItem = new JMenuItem("Project from Existing Source...");//1_2)
        jMenu1.add(jMenuItem);
        jMenu1.setDoubleBuffered(false);

        JMenu jMenu2 = new JMenu("Project from Version Control.."); //1_3>
        jMenu1.add(jMenu2);
        jMenuItem  = new JMenuItem("CVS"); //1_3_1)
        jMenuItem.setMnemonic(KeyEvent.VK_C);
        jMenu2.add(jMenuItem);
        jMenuItem  = new JMenuItem("Git"); //1_3_2)
        jMenuItem.setMnemonic(KeyEvent.VK_G);
        jMenu2.add(jMenuItem);

        jMenu.add(jMenu1);
    }
    public void inOpenMenu(){
        JMenuItem jMenuItem = new JMenuItem("Open");   // 1)
        jMenuItem.setMnemonic(KeyEvent.VK_O);

        jMenu.add(jMenuItem);
    }
    public void inOpenRecentMenu(){
        JMenu jMenu = new JMenu("Open Recent"); // 1>
        jMenu.setMnemonic(KeyEvent.VK_R);

        this.jMenu.add(jMenu);
    }
    public void inClossProjectMenu(){
        JMenuItem jMenuItem = new JMenuItem("Closs Project"); // 1)
        jMenuItem.setMnemonic(KeyEvent.VK_C);

        jMenu.add(jMenuItem);
    }
    public void inSettingMenu(){
        JMenuItem jMenuItem = new JMenuItem("Setting...."); // 1)
        jMenuItem.setMnemonic(KeyEvent.VK_S);

        jMenu.add(jMenuItem);
    }
}
