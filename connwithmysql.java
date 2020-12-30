package UMS_project;
import java.sql.*;
import javax.swing.*;
public class connwithmysql 
{
    Connection con;
    Statement stmt;
    ResultSet rs;
    public connwithmysql()
    {
        JFrame f=new JFrame();  
       // JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); 
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");
            stmt = con.createStatement();
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(f,"connection was not successfull");
        }
    }
    
}
