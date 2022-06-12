package game.elements;

import javax.swing.*;
import java.awt.*;

public class TopTitle extends JLabel {
    public TopTitle(){
        setText("◯'s turn");
        setBounds(0,0,300,100);
        setFont(new Font("Serif", Font.BOLD, 24));
        setVisible(true);
        setAlignmentX(CENTER_ALIGNMENT);
    }
    public void click(int x){
        if(x%2==0)
            setText("✕'s turn");
        else
            setText("◯'s turn");
    }
}
