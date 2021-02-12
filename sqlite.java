package SE360;

import javax.swing.*;
import java.sql.*;

public class sqlite {
    String a ;
    String b ;
    Statement state = null;
    String op;
    Connection c = null;
    String select = "select* from db where Username=? and Password =?";
    public void connect() {


        String url = "jdbc:sqlite:C:\\Users\\Ege\\Desktop\\db.db";

        try {
            c = DriverManager.getConnection(url);
            System.out.println("Connection suceed");
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());


        }


    }
    public void login(String username,String password)  {
        try {

            connect();
            PreparedStatement ps1 = c.prepareStatement(select);
            ps1.setString(1,username);
            ps1.setString(2,password);
            ResultSet res = ps1.executeQuery();
            if(res != null){
                res.next();
                JOptionPane.showMessageDialog(Signup.passtext,"Welcome again!.");
                Secondgui.money = res.getString("Money");
                new Secondgui();
                Signup.frame2.dispose();
                Signup.frame.dispose();
                FirstPage.f.dispose();

                }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect username and password");

                }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void insert(String username, String password, String money) throws SQLException {
        connect();
        PreparedStatement ps = null;
        String sql = "INSERT INTO  db(Username,Password,Money) VALUES(?,?,?)";
        try{
            ps = c.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.setInt(3,Integer.parseInt(money));
            ps.executeUpdate();


            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        c.close();

    }
    public int display(String username,String password)  {


        try {
            username = a;
            password = b;
            connect();
            PreparedStatement ps1 = c.prepareStatement(select);
            ps1.setString(1,a);
            ps1.setString(2,b);

            ResultSet res = ps1.executeQuery();

            if(res != null){
                res.next();
                String Money = res.getString("Money");
                return Integer.parseInt(Money);

            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect username and password");
                return 0;

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;

    }


}
