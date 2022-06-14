package game.elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    TicBox button1 = new TicBox(0, 0);
    TicBox button2 = new TicBox(0, 1);
    TicBox button3 = new TicBox(0, 2);
    TicBox button4 = new TicBox(1, 0);
    TicBox button5 = new TicBox(1, 1);
    TicBox button6 = new TicBox(1, 2);
    TicBox button7 = new TicBox(2, 0);
    TicBox button8 = new TicBox(2, 1);
    TicBox button9 = new TicBox(2, 2);
    TopTitle topTitle = new TopTitle();
    Score score = new Score();
    int moves = 0;
    SmallBtn resetBtn = new SmallBtn("Reset",95);
    SmallBtn about = new SmallBtn("About",170);
    String turn;

    public GamePanel() {
        setBackground(Color.decode("#121212"));
        setLayout(null);

        add(topTitle);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(score);
        add(resetBtn);
        add(about);

        button1.addActionListener(buttonClick);
        button2.addActionListener(buttonClick);
        button3.addActionListener(buttonClick);
        button4.addActionListener(buttonClick);
        button5.addActionListener(buttonClick);
        button6.addActionListener(buttonClick);
        button7.addActionListener(buttonClick);
        button8.addActionListener(buttonClick);
        button9.addActionListener(buttonClick);
        resetBtn.addActionListener(resetScore);
        about.addActionListener(aboutDialogue);
    }

    ActionListener buttonClick = e -> {
        if (((TicBox) e.getSource()).getText().equals(" ")) {
            moves++;
            if (moves % 2 == 0) {
                turn = "✕";
            } else
                turn = "◯";

            ((TicBox) e.getSource()).click(turn);
            topTitle.click(moves);
            check();
        }
    };




    ActionListener aboutDialogue =
            e -> JOptionPane.showMessageDialog(
            button5,
            "Made by Ashikur Rahman Shad",
            "About",
            JOptionPane.WARNING_MESSAGE);

    ActionListener resetScore = e -> {
        score.reset();
        score.updateScore(0,0);
        reset();
        topTitle.setText("◯'s turn");
    };

    /*
    1 2 3
    4 5 6
    7 8 9*/

    void check() {
        if (
                (
                        (!button1.getText().equals(" ")) &
                                (button1.getText().equals(button2.getText())) &
                                (button2.getText().equals(button3.getText()))
                ) | (
                        (!button4.getText().equals(" ")) &
                                (button4.getText().equals(button5.getText())) &
                                (button5.getText().equals(button6.getText()))
                ) | (
                        (!button7.getText().equals(" ")) &
                                (button7.getText().equals(button8.getText())) &
                                (button8.getText().equals(button9.getText()))
                ) | (

                        (!button1.getText().equals(" ")) &
                                (button1.getText().equals(button4.getText())) &
                                (button4.getText().equals(button7.getText()))
                ) | (

                        (!button2.getText().equals(" ")) &
                                (button2.getText().equals(button5.getText())) &
                                (button5.getText().equals(button8.getText()))
                ) | (

                        (!button3.getText().equals(" ")) &
                                (button3.getText().equals(button6.getText())) &
                                (button6.getText().equals(button9.getText()))
                ) | (

                        (!button1.getText().equals(" ")) &
                                (button1.getText().equals(button5.getText())) &
                                (button5.getText().equals(button9.getText()))
                ) | (

                        (!button3.getText().equals(" ")) &
                                (button3.getText().equals(button5.getText())) &
                                (button5.getText().equals(button7.getText()))
                )
        ) {
            topTitle.setText("<html>"
                    +turn + " Win! Another round?" +
                    "<br/>◯'s turn<html>");

            if(turn.equals("✕")){
                score.updateScore(0,1);
            }else {
                score.updateScore(1,0);
            }
            reset();
        } else if(moves==9){
            topTitle.setText("<html>Draw! Another round?<br/>◯'s turn<html>");
            reset();
        }
    }
    void reset(){
        moves=0;
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
    }
}

