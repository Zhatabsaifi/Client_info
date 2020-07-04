package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    static public Connection c;
    static public Statement st;
    static public PreparedStatement insertUser;
    static public PreparedStatement getUsers;
    static public PreparedStatement updateUser;
    static{
        try{
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //c=DriverManager.getConnection(
    // "jdbc:oracle:thin:@localhost:1521:xe",
    //  "clientsol100","clientsol100");
        c=DriverManager.getConnection(
  "jdbc:oracle:thin:@localhost:1521:xe","CLIENT DATA BASE","zhatab");
        st=c.createStatement();
        insertUser=c.prepareStatement(
          "insert into Client (name,gender,dob,country,address,"
                  + "language) values(?,?,?,?,?,?)");
        getUsers=c.prepareStatement(
                "select * from Client where name like ?");
        updateUser=c.prepareStatement(
          "update Client set name=?,gender=?,dob=?,country=?,address=?,"
                  + "language=? where cid=?");
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
        }
    }
}
