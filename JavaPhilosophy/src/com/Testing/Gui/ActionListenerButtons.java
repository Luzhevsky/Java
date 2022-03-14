package com.Testing.Gui;
import javax.swing.*;
import java.awt.event.*;

public class ActionListenerButtons implements ActionListener{
    JButton button;

    public void go(){
        JFrame frame = new JFrame("RaidClicker");

        button = new JButton("Start");
        frame.add(button);

        button.addActionListener(this::actionPerformed);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        button.setText("hello");
    }
}
