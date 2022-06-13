package game.elements;

import javax.swing.*;
import java.awt.*;

public class TicBox extends JButton {
    String value=" ";
    int X;
    int Y;
    public TicBox(int row,int column){
        X=row;
        Y=column;
        setBounds(Y*100,X*100+100,100,100);
        setForeground(Color.WHITE);
        setBackground(Color.decode("#212121"));
        setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        //setBorderPainted(false);
        setText(value);
        setFocusPainted(false);
        setFont(new Font("Serif", Font.PLAIN, 56));
    }
    public void click(String x){
        if(value.equals(" ")){
            value=x;
            setText(x);
        }
    }
}
