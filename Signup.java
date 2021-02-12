package SE360;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Signup implements ActionListener {
    static int b;
    static JFrame frame = new JFrame();
    static JFrame frame2 = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel title2 = new JLabel("Welcome. Please Login");
    JLabel title = new JLabel(" SIGNUP ");
    JLabel Username = new JLabel("USERNAME");
    JLabel Password = new JLabel("PASSWORD");
    JLabel Money = new JLabel("MONEY");
    static JTextField usertext = new JTextField();
    JTextField moneytext = new JTextField();
    static JPasswordField passtext = new JPasswordField();
    JButton register = new JButton("SIGNUP");
    JButton login = new JButton("LOGIN");
    static String us = usertext.getText();
    static String pass = passtext.getText();


    public void Register(){
        frame.setResizable(false);
        frame.setVisible(true);
        register.setBounds(70,400,100,35);
        moneytext.setBounds(180,243,165,23);
        Money.setBounds(20,220,80,70);
        frame.add(register);
        frame.add(moneytext);
        frame.add(Money);
        createWindow();
        setLocationandSize();
        addComp();
        Actionevent();



    }
    public void Login(){
        login.setBounds(220,400,100,35);

        frame2.setVisible(true);
        createWindow();
        setLocationandSize();
        addComp2();
        Actionevent();

    }

    public void createWindow(){
        frame2.setResizable(false);
        frame2.setTitle("VIRTUAL BOUTIQUE");
        frame2.setBounds(40,40,480,600);
        frame2.getContentPane().setBackground(Color.magenta);
        frame2.getContentPane().setLayout(null);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("VIRTUAL BOUTIQUE");
        frame.setBounds(40,40,480,600);
        frame.getContentPane().setBackground(Color.magenta);
        frame.getContentPane().setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void setLocationandSize(){
        panel.setBounds(0,0,480,100);
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setFont(new Font("MV Boli",Font.PLAIN,30));
        panel2.setBounds(0,0,480,100);
        title2.setHorizontalTextPosition(JLabel.CENTER);
        title2.setFont(new Font("MV Boli",Font.PLAIN,30));

        Username.setBounds(20,120,80,70);
        Password.setBounds(20,170,80,70);
        usertext.setBounds(180,143,165,23);
        passtext.setBounds(180,193,165,23);



    }
    public void addComp(){
        panel.add(title);
        frame.add(Username);
        frame.add(Password);
        frame.add(usertext);
        frame.add(passtext);
        frame.add(panel);}
    public void addComp2(){
        panel2.add(title2);
        frame2.add(login);
        frame2.add(Username);
        frame2.add(Password);
        frame2.add(usertext);
        frame2.add(passtext);
        frame2.add(panel2);}


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==register){
            if (isNumeric(moneytext.getText())){
                sqlite sqlite = new sqlite();
                try {
                    sqlite.insert(usertext.getText(),passtext.getText(),moneytext.getText());
                    JOptionPane.showMessageDialog(frame.getComponent(0), "SIGNED UP!!");
                    Login();





                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
            else {
                JOptionPane.showMessageDialog(frame.getComponent(0),"Invalid Money amount please try again");
            }


        }

        else if(e.getSource()==login){

            sqlite sqlite = new sqlite();
            sqlite.login(usertext.getText(),passtext.getText());




        }


    }
    public void Actionevent(){
        register.addActionListener(this);
        login.addActionListener(this);

    }
    public boolean isNumeric(String x){
        if (x == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(x);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }




}
