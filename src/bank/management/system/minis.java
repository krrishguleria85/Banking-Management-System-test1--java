package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class minis extends JFrame implements ActionListener {
    String pin;

    JButton button;

    minis(String pin){
        this.pin = pin;



        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2 = new JLabel("IDBI BANK");
        label2.setFont(new Font("System",Font.BOLD,18));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,560,300,20);
        add(label4);



        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4)+ "XXXXXXXXXXXX"+ resultSet.getString("card_number").substring(12));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }



        try{
            int balance = 0;
            Conn c = new Conn();
            ResultSet resultSet= c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><br><br><html>");

                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+balance);

        } catch (Exception e) {
            e.printStackTrace();
        }



        button = new JButton("Exit");
        button.setBounds(20,650,100,25);
        button.addActionListener(this);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        add(button);





        getContentPane().setBackground(new Color(245,204,204));
        setSize(450,750);
        setLocation(20,20);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new minis("");
    }
}
