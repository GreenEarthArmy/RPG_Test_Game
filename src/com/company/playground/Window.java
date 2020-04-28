package com.company.playground;

import javax.swing.*;
import java.awt.*;


public class Window {
    Info gInfo = new Info();

    public void GUI(){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));

        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(gInfo.getGameName());
        frame.pack();
        frame.setVisible(true);
    }
}
