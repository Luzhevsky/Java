package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class QuizCardPlayer {

    private JTextArea display;
    private boolean isShowAnser;
    private JButton nextButton;
    private QuizCard currentCard;
    private int currentCardIndex;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;
    public QuizCardPlayer() {
    }


    public void go(){
        frame = new JFrame("QuizCardBuilder");
        JPanel panel = new JPanel();


 //Jmenu
        Font font = new Font("sanserif", Font.BOLD, 24);
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        menu.add(file);

        JMenuItem save = new JMenuItem("Load card set");
        save.addActionListener(new OpenMenuListener());
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

        nextButton = new JButton("Show Question");

        panel.add(qScroll);
        panel.add(nextButton);

        nextButton.addActionListener(new NextCardListener());



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
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnser = false;
            } else {
                if(currentCardIndex < cardList.size()){
                    showNextCard();
                } else {
                    display.setText("That was last card");
                    nextButton.setEnabled(false);
                }

            }
        }

    }
    public class OpenMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            JFileChooser f = new JFileChooser();
            f.showSaveDialog(frame);
            loadFile(f.getSelectedFile());
        }

    }

    public void loadFile(File file){
        cardList = new ArrayList<QuizCard>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine())!= null){
                makeCard(line);
            }
            reader.close();
        } catch(Exception ex){
            System.out.println("couldn't read the card file");
            ex.printStackTrace();
        }
    }

    private void makeCard(String lineToParse){
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("made a card");
    }
    private void showNextCard(){
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnser = true;
    }





    public static void main(String[] args) {
        // write your code here

    }
}
