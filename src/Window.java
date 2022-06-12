import game.elements.GamePanel;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {
    GamePanel newGame = new GamePanel();
    public Window(){
        setTitle("TicTacToe");
        setSize(300,450);
        setResizable(false);
        setLayout(null);
        setContentPane(newGame);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
