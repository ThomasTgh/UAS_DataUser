package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                frame.dispose();
            }
        });
        JButton button2 = new JButton("Registrasi");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        JButton button3 = new JButton("Lihat Data");
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.setLayout(null);

        frame.setSize(400,150);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
