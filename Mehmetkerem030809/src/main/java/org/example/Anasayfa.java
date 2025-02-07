package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {
    JFrame frame = new JFrame();
    JButton buton = new JButton("profili göster");

    public Anasayfa(){
        buton.addActionListener(this);
        buton.setBounds(200,200,100,50);
        frame.add(buton);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Anasayfa");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buton){
            profilSayfa profilSayfa = new profilSayfa();
        }
    }
}
