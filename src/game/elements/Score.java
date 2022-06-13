package game.elements;

import javax.swing.*;
import java.awt.*;

public class Score extends JLabel {
    int O;
    int X;

    public Score(){
        setBounds(15,415,310,50);
        setFont(new Font("Serif", Font.BOLD, 23));
        setForeground(Color.WHITE);
    }

    public void updateScore(int o, int x){
        O=O+o;
        X=X+x;
        setText("<html>✕ : &nbsp;"+
                X+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                "◯ : &nbsp;"+
                O
                );
    }
    public void reset(){
        X=0;
        O=0;
    }

}
