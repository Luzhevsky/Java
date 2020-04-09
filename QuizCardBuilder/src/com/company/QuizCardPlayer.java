package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizCardPlayer {

    JTextArea display;
    boolean isShowAnser;

    public void go(){
        JFrame frame = new JFrame("QuizCardBuilder");
        JPanel panel = new JPanel();


 //Jmenu
        Font font = new Font("sanserif", Font.BOLD, 24);
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        menu.add(file);

        JMenuItem save = new JMenuItem("Load card set");
        file.add(save);

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
//textarea
        display = new JTextArea(10, 20);
        display.setFont(font);
        display.setLineWrap(true);
        display.setEditable(false);


        JScrollPane qScroll = new JScrollPane(display);
        qScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Show Question");
        nextButton.addActionListener(new NextCardListener());

        panel.add(qScroll);
        panel.add(nextButton);

//frame
        frame.setJMenuBar(menu);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 500);
        frame.setVisible(true);


    }
    public class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if(isShowAnser){

            } else {

            }
        }

    }
    public static void main(String[] args) {
        // write your code here

    }
}
