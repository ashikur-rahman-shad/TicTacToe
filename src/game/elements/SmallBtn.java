package game.elements;

import javax.swing.*;
import java.awt.*;

public class SmallBtn extends JButton {
    public SmallBtn(String s,int x){
        setBounds(x,425,60,30);
        setForeground(Color.WHITE);
        setText(s);
        setBackground(Color.decode("#212121"));
        setForeground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        setBorderPainted(false);
        setFocusPainted(false);
        setFont(new Font("Serif", Font.BOLD, 15));
    }
}
