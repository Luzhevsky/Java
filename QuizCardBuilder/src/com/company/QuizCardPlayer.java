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
    private boolean visible;


    public void go(){
        frame = new JFrame("Игра в карточки");
        JPanel panel = new JPanel();


 //Jmenu
        Font font = new Font("sanserif", Font.BOLD, 24);
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("Файл");
        menu.add(file);

        JMenuItem new_card = new JMenuItem("Добавить карт");
        new_card.addActionListener(new New_card_set());
        file.add(new_card);

        JMenuItem save = new JMenuItem("Загрузить сохраненые карты");
        save.addActionListener(new OpenMenuListener());
        file.add(save);

        JMenuItem exit = new JMenuItem("Выход");
        file.add(exit);
//textarea
        display = new JTextArea(10, 20);
        display.setFont(font);
        display.setLineWrap(true);
        display.setEditable(false);


        JScrollPane qScroll = new JScrollPane(display);
        qScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nextButton = new JButton("Посмотреть ответ");

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

    public class New_card_set implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCardBuilder builder = new QuizCardBuilder();
            builder.GUI();
        }
    }
    public class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if(isShowAnser){
                display.setText(currentCard.getAnswer());
                nextButton.setText("Следующая карта");
                isShowAnser = false;
            } else {
                if(currentCardIndex < cardList.size()){
                    showNextCard();
                } else {
                    display.setText("Это была последняя");
//                    nextButton.setEnabled(false);
                }

            }
        }

    }
    public class OpenMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            JFileChooser f = new JFileChooser();
            f.showOpenDialog(frame);
            loadFile(f.getSelectedFile());
        }

    }

    public void loadFile(File file){
        cardList = new ArrayList<QuizCard>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine())!= null){
                makeCard(line);
            }
            reader.close();
        } catch(Exception ex){
            System.out.println("Не могу прочитать файл с картами");
            ex.printStackTrace();
        }
    }

    private void makeCard(String lineToParse){
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
    }
    private void showNextCard(){
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Посмотреть ответ");
        isShowAnser = true;
    }

}
