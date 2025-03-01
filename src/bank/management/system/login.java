package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1, button2, button3;

    login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(352, 10, 100, 96);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(650, 350, 100, 96);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 37));
        label1.setBounds(235, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Railway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(152, 190, 375, 30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(305, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Railway", Font.BOLD, 28));
        label3.setBounds(152, 240, 375, 30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(305, 240, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

//        all button
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(305, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(435, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.white);
        button3.setBounds(305, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

//        background des
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image b2 = b1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bmage = new JLabel(b3);
        bmage.setBounds(0, 0, 850, 480);
        add(bmage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setUndecorated(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){
                Conn c = new Conn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }else if (e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new login();
    }
}
