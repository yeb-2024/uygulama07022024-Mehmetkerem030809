package org.example;

import javax.swing.*;
import java.awt.*;

public class profilSayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public profilSayfa(){
        label.setText("İsim: Testo Taylan Ev Ziyareti");
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("anasayfa");
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
