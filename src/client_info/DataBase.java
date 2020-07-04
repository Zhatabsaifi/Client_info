package client_info;
import java.sql.*;
import javax.swing.JOptionPane;
public class DataBase {
   public static Connection c;
   public static Statement st;
   public static PreparedStatement insert,sea,sort,update;
   static{
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CLIENT DATA BASE","zhatab");
           st = c.createStatement();
           insert =c.prepareStatement("insert into Client (NAME,FATHER,GENDER,SALARY,MOBILE,COUNTRY,ADDRESS,DOB) values (?,?,?,?,?,?,?,?)");
           sea = c.prepareStatement( "select * from Client  where name like ?");
           sort = c.prepareStatement("select * from Client order by CLIENT_ID asc");
           update=c.prepareStatement("update Client set name=?,father=?,gender=?,salary=?,mobile=?,country=?,address=?,DOB=? where CLIENT_ID =?");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
       }
   }
    static void update(String n, String f, String s, String m, String c, String a, String cid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
