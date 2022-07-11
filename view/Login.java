package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    public Login() throws IOException{
        JFrame frame = new JFrame("Harapan Database");

        JLabel label1 = new JLabel("Email");
        label1.setBounds(60,10,100,25);
        JTextField field1 = new JTextField();
        field1.setBounds(145,10,125,25);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(60,40,100,25);
        JPasswordField field2 = new JPasswordField();
        field2.setBounds(145,40,125,25);

        JButton button1 = new JButton("Login");
        button1.setBounds(180, 80, 100,20);

        JButton button2 = new JButton("Back");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainMenu();
                frame.dispose();
            }
        });
        button2.setBounds(40,80,100,20);
        
        BufferedImage img = ImageIO.read(new File("logo.png"));
        JLabel pic = new JLabel(new ImageIcon(img));
        pic.setBounds(15, 15, 35, 35);

        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button1);
        panel.add(button2);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        panel.setLayout(null);
        panel.add(pic);

        frame.setSize(400,150);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
