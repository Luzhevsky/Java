package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class QuizCardBuilder {

    JFrame frame;
    JPanel panel1;
    JButton buttonNext;
    JTextArea textFieldQuestion;
    JTextArea textFieldAnswer;
    ArrayList<QuizCard> cardList;

    public void GUI() {
        frame = new JFrame("Создание карт");
        panel1 = new JPanel();

//menubar
        JMenuBar menu = new JMenuBar();
        Font font = new Font("sanserif", Font.BOLD, 24);

        JMenu file = new JMenu("File");
        menu.add(file);

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(new SaveCard());
        file.add(save);

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

//question

        textFieldQuestion = new JTextArea(6, 20);
        textFieldQuestion.setLineWrap(true);
        textFieldQuestion.setWrapStyleWord(true);
        textFieldQuestion.setFont(font);

        JScrollPane qScroll = new JScrollPane(textFieldQuestion);
        qScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

//answer

        textFieldAnswer = new JTextArea(6, 20);
        textFieldAnswer.setLineWrap(true);
        textFieldAnswer.setWrapStyleWord(true);
        textFieldAnswer.setFont(font);

        JScrollPane aScroll = new JScrollPane(textFieldAnswer);
        aScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

//JButton
        buttonNext = new JButton("Next Card");
        buttonNext.addActionListener(new NextCard());

//add on panel1
        cardList = new ArrayList<QuizCard>();

        JLabel aLabel = new JLabel("Answer:");
        JLabel qLabel = new JLabel("Question:");

        panel1.add(qLabel);
        panel1.add(qScroll);
        panel1.add(aLabel);
        panel1.add(aScroll);
        panel1.add(buttonNext);

        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.setJMenuBar(menu);


        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    private void clearCard(){
        textFieldQuestion.setText("");
        textFieldAnswer.setText("");
        textFieldQuestion.requestFocus();
    }

    public class NextCard implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           QuizCard card = new QuizCard(textFieldQuestion.getText(),textFieldAnswer.getText());
           cardList.add(card);
           clearCard();
        }
    }

    public class SaveCard implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JFileChooser filesave = new JFileChooser();
            filesave.showSaveDialog(frame);
            saveFile(filesave.getSelectedFile());

        }
    }

    private void saveFile(File file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(QuizCard card:cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer()+ "\n");
            }
            writer.close();
        } catch (IOException ec){
            ec.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here
        QuizCardPlayer player = new QuizCardPlayer();
        player.go();
    }
}
