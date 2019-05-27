package com.jMenuComponet.menuPackage;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EditMenu {
    JMenu jMenu = new JMenu("Edit");
    public EditMenu(){
        jMenu.setMnemonic(KeyEvent.VK_E);
    }
    public JMenu getjMenu(){
        inUndoTypingMenu();
        inRedoMenu();
        jMenu.addSeparator();
        inCutMenu();
        inCopyMenu();
        inCopyPathMenu();
        inDeleteMenu();
        jMenu.addSeparator();
        inFindMenu();

        return jMenu;
    }

    public void inUndoTypingMenu(){
        JMenuItem jMenuItem = new JMenuItem("Undo Typing");
        jMenuItem.setMnemonic(KeyEvent.VK_U);

        jMenu.add(jMenuItem);
    }
    public void inRedoMenu(){
        JMenuItem jMenuItem = new JMenuItem("Redo");
        jMenuItem.setMnemonic(KeyEvent.VK_R);

        jMenu.add(jMenuItem);
    }
    public void inCutMenu(){
        JMenuItem jMenuItem = new JMenuItem("Cut");
        jMenuItem.setMnemonic(KeyEvent.VK_C);

        jMenu.add(jMenuItem);
    }
    public void inCopyMenu(){
        JMenuItem jMenuItem = new JMenuItem("Copy");
        jMenuItem.setMnemonic(KeyEvent.VK_P);

        jMenu.add(jMenuItem);
    }
    public void inCopyPathMenu(){
        JMenuItem jMenuItem = new JMenuItem("Copy Path");
        jMenuItem.setMnemonic(KeyEvent.VK_H);

        jMenu.add(jMenuItem);
    }
    public void inDeleteMenu(){
        JMenuItem jMenuItem = new JMenuItem("Delete");
        jMenuItem.setMnemonic(KeyEvent.VK_D);

        jMenu.add(jMenuItem);
    }
    public void inFindMenu(){
        JMenu jMenu = new JMenu("Find"); //1>
        jMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem jMenuItem = new JMenuItem("Find..."); //1_1)
        jMenuItem.setMnemonic(KeyEvent.VK_F);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Replase..."); //1_2)
        jMenuItem.setMnemonic(KeyEvent.VK_R);
        jMenu.add(jMenuItem);

        this.jMenu.add(jMenu);
    }

}
