package com.changingWindow;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Window2 {
    private JPanel jPanel = new JPanel();

    Window2(){
        jPanel.setLayout(new BorderLayout());

        JLabel jLabel = new JLabel("阿   珂", JLabel.CENTER);
        Border border = BorderFactory.createBevelBorder(0, Color.RED, Color.GREEN);
        jLabel.setBorder(border);
        jPanel.add(jLabel, BorderLayout.NORTH);

        setCenterPart();  //show CenterPart
    }
    public JPanel getjPanel(){
        return jPanel;
    }
    public void setCenterPart(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1,3, 5, 5));
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        jPanel.add(jPanel3);

        //border
        Border border = BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(0), "属性",2, 0);
        jPanel1.setBorder(border);
        ((TitledBorder) border).setTitleColor(Color.BLUE);

        border = BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(0), "图像",2, 0);
        jPanel2.setBorder(border);
        ((TitledBorder) border).setTitleColor(Color.BLUE);

        border = BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(0), "说明", 2, 0);
        jPanel3.setBorder(border);
        ((TitledBorder) border).setTitleColor(Color.BLUE);

        this.jPanel.add(jPanel, BorderLayout.CENTER);
    }

    public void setViseable(boolean bool){
        jPanel.setVisible(bool);
    }
}
