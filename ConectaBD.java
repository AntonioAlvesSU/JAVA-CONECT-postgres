
package proj;

import java.sql.*;
import javax.swing.*;


public class ConectaBD {

    public static Connection conectabd() throws ClassNotFoundException{
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/VOL_GETSEMANI","postgres","VOL2019");
            return con;            
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog (null,error);
            
            return null;
            
        }
        
    }
   
}


