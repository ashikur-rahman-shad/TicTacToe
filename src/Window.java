import game.elements.GamePanel;
import game.elements.SmallBtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
    GamePanel newGame = new GamePanel();
    SmallBtn about = new SmallBtn("About",170);
    public Window(){
        setTitle("TicTacToe");
        setSize(325,500);
        setResizable(false);
        setLayout(null);
        setContentPane(newGame);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
