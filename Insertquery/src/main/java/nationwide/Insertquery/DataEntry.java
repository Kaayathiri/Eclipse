package nationwide.Insertquery;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DataEntry implements ActionListener{
	 TextField TR,TN,TM;
     Statement stmt;
    public DataEntry(TextField T1,TextField T2,TextField T3) {
        TR=T1;
        TN=T2;
        TM=T3;
        
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "Lojinie1995.");
                stmt = con.createStatement();                
         }
         catch(Exception E) {
             System.out.println(E.toString());
         }
    }
    public void actionPerformed(ActionEvent e) {

        String regno,name,marks;
        String insertquery="";
        regno=TR.getText();
        name=TN.getText();
        marks=TM.getText();
        insertquery=" insert into school values("+regno+",'"+name+"',"+marks+")";
    
        try {
        stmt.executeUpdate(insertquery);
       
         }
         catch(Exception E) {
             System.out.println(E.toString());
         }

}		
}
