package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu {
    public MainMenu(){
        JFrame frame = new JFrame("Harapan Database");
    
        JButton button1 = new JButton("Login");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    new Login();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        button1.setBounds(50,60,100,30);
        JButton button2 = new JButton("Registrasi");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Register();
                frame.dispose();
            }
        });
        button2.setBounds(250,60,100,30);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        panel.add(button1);
        panel.add(button2);
        panel.setLayout(null);

        frame.setSize(400,150);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
