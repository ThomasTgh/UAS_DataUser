package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Register {
    public Register(){
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Email");
        
        JLabel label2 = new JLabel("Nama");

        JLabel label3 = new JLabel("Password");

        JLabel label4 = new JLabel("Foto");

        JLabel label5 = new JLabel("Category"); 

        JButton button1 = new JButton("Register");

        JButton button2 = new JButton("Back");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainMenu();
                frame.dispose();
            }
        });
    }
}
