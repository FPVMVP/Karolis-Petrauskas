import javax.swing.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnozes?autoReconnect=true&useSSL=false", "root", "123456");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from rodiklis");

        while(rs.next())
            try {
                System.out.println("Id: " + rs.getInt(1) + "\nHemoglobinas: " + rs.getInt(2)
                        + "\nTrombocitai: " + rs.getInt(3) + "\nLiaukocitai: " + rs.getInt(4) + "\n");
            }

            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Atsiprasome bet duoments netinka");
            }

    }

}
