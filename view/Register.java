package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {
    public Register(){
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Email");
        label1.setBounds(25, 10, 100, 25);
        JTextField field1 = new JTextField();
        field1.setBounds(120, 15, 100, 25);

        JLabel label2 = new JLabel("Nama");
        label2.setBounds(25, 40, 100, 25);
        JTextField field2 = new JTextField();
        field2.setBounds(120, 45, 100, 25);

        JLabel label3 = new JLabel("Password");
        label3.setBounds(25, 70, 100, 25);
        JPasswordField field3 = new JPasswordField();
        field3.setBounds(120, 75, 100, 25);

        JLabel label4 = new JLabel("Foto");
        label4.setBounds(25, 100, 100, 25);

        JLabel label5 = new JLabel("Category"); 
        label5.setBounds(25, 130, 100, 25);

        JButton button1 = new JButton("Register");
        button1.setBounds(25, 220, 100, 25);

        JButton button2 = new JButton("Back");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainMenu();
                frame.dispose();
            }
        });
        button2.setBounds(140, 220, 100, 25);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        panel.setLayout(null);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(button1);
        panel.add(button2);
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);

        frame.setSize(400,350);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
