package SE360;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends Thread implements ActionListener {
    static int timer = 5;
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Virtual Boutique");
    int x;
    JPanel panel = new JPanel(new GridLayout(2, 1));
    JPanel panel2 = new JPanel(new FlowLayout());
    JButton confirm = new JButton("CONFIRM");

    JRadioButton FromWallet = new JRadioButton("Wallet");
    JRadioButton CreditCard = new JRadioButton("Credit Card");

    public Payment() {
        JLabel cash1 = new JLabel();
        ImageIcon cash = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\cash.jpg");
        cash1.setIcon(cash);
        cash1.setBounds(420, 360, 60, 60);

        ImageIcon card = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\card.jpg");
        JLabel card1 = new JLabel();
        card1.setIcon(card);
        card1.setBounds(420, 460, 60, 60);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);


        FromWallet.setBounds(300, 360, 100, 30);


        CreditCard.setBounds(300, 460, 100, 30);

        confirm.setBackground(Color.gray);
        confirm.setBounds(300, 550, 160, 40);
        confirm.setFont(new Font("Arial", Font.BOLD, 20));


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(FromWallet);
        buttonGroup.add(CreditCard);


        JLabel PaymentMethod = new JLabel("Select a Payment Method");
        PaymentMethod.setForeground(Color.BLACK);
        PaymentMethod.setBounds(300, 300, 370, 60);
        PaymentMethod.setFont(new Font("Arial", Font.PLAIN, 30));

        JLabel Cost = new JLabel("Total Cost is " + Secondgui.cost);
        Cost.setForeground(Color.BLUE);
        Cost.setBounds(0, 300, 190, 40);
        Cost.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel MoneyinData = new JLabel("You Have " + Secondgui.money);
        MoneyinData.setForeground(Color.PINK);
        MoneyinData.setBounds(0, 340, 190, 40);
        MoneyinData.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel MoneyLeft = new JLabel("Money is left " + (Integer.parseInt(Secondgui.money) - Secondgui.cost));
        MoneyLeft.setForeground(Color.RED);
        MoneyLeft.setBounds(0, 380, 190, 40);
        MoneyLeft.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel shops = new JLabel("Your Shops");
        shops.setFont(new Font("MV Boli", Font.PLAIN, 30));

        label.setFont(new Font("MV Boli", Font.PLAIN, 30));

        panel.setBackground(Color.CYAN);
        panel.setBounds(0, 0, 750, 60);
        panel.add(label);
        panel.add(shops);


        panel2.setBounds(0, 60, 750, 250);

        for (ImageIcon a : Secondgui.arrayList) {
            JLabel p = new JLabel();
            p.setIcon(a);
            panel2.add(p);

        }
        frame.add(confirm);
        frame.add(card1);
        frame.add(cash1);
        frame.add(FromWallet);
        frame.add(CreditCard);
        frame.add(PaymentMethod);
        frame.add(MoneyLeft);
        frame.add(MoneyinData);
        frame.add(panel);
        frame.add(panel2);
        frame.add(Cost);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
        FromWallet.addActionListener(this);
        confirm.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (FromWallet.isSelected() && e.getSource() == confirm) {
            JOptionPane.showMessageDialog(confirm, "Your payment has confirmed.");
            start();
            frame.dispose();

        } else if (CreditCard.isSelected() && e.getSource() == confirm) {
            JOptionPane.showInputDialog("Enter Your Card Number");
            int dialog = JOptionPane.showConfirmDialog(confirm, "Are you confirm that shopping");
            if (dialog == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(confirm, "Sucessfull shopping");
                start();
            }
            if (dialog == JOptionPane.NO_OPTION)
                return;

        }

    }


}
