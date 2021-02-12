package SE360;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage  implements ActionListener  {
    static JFrame f = new JFrame();
    JLabel l = new JLabel("Fashion as unique as you are");
    JLabel l2 = new JLabel("Virtual Boutique");
    JButton register = new JButton("SIGNUP");
    JButton login = new JButton("LOGIN");
    public FirstPage(){

        register.setFont(new Font("Arial", Font.PLAIN, 25));
        register.setBorder(BorderFactory.createEtchedBorder());

        login.setFont(new Font("Arial", Font.PLAIN, 25));
        login.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon image = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\showroom.png","Fashion as unique as you are");

        l.setIcon(image);
        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        register.setBackground(Color.CYAN);
        login.setBackground(Color.MAGENTA);
        p2.setBackground(Color.lightGray);
        l.setVerticalTextPosition(JLabel.NORTH);
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setFont(new Font("MV Boli",Font.PLAIN,20));
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setFont(new Font("MV Boli",Font.PLAIN,50));

        register.setBounds(110,200,200,70);
        login.setBounds(470,200,200,70);
        p2.setBounds(0,0,750,100);
        p.setBounds(0,100,750,650);


        p2.add(l2);
        p.add(l);

        f.setResizable(false);
        f.setSize(750,750);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(register);
        f.add(login);
        f.add(p);
        f.add(p2);
        Actionevent();

    }
    public void Actionevent(){
        register.addActionListener(this);
        login.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== register ){
            Signup signup = new Signup();
            signup.Register();

            f.setVisible(false);
        }
        else if(e.getSource()==login){
            new Signup().Login();
        }


    }


    public static void main(String[] args) {
        FirstPage firstPage = new FirstPage();
    }
}
