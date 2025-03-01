package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label1.setBounds(470,180,700,30);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,20));
        l3.add(label1);


        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,120));
        b1.setBounds(410,272,135,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,120));
        b2.setBounds(710,272,135,30);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,120));
        b3.setBounds(410,318,135,30);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,120));
        b4.setBounds(710,318,135,30);
        b4.addActionListener(this);
        l3.add(b4);


        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,120));
        b5.setBounds(410,365,135,30);
        b5.addActionListener(this);
        l3.add(b5);


        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,120));
        b6.setBounds(695,365,150,30);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,120));
        b7.setBounds(710,412,135,30);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource()==b7){
            setVisible(false);
            new main_Class(pin);
        }
        else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn c = new Conn();
            Date date = new Date();

            try{
                ResultSet resultSet= c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"', 'withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+"  Debited Successfully");

            } catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }

    }
    public static void main(String[] args) {
        new FastCash("");
    }
}
