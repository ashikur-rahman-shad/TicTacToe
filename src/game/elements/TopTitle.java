package game.elements;

import javax.swing.*;
import java.awt.*;

public class TopTitle extends JLabel {
    public TopTitle(){
        setText("◯'s turn");
        setForeground(Color.WHITE);
        setBounds(10,0,280,100);
        setFont(new Font("Serif", Font.BOLD, 24));
        setAlignmentX(CENTER_ALIGNMENT);
        setHorizontalAlignment(CENTER);
    }
    public void click(int x){
        if(x%2==0)
            setText("◯'s turn");
        else
            setText("✕'s turn");
    }
}
