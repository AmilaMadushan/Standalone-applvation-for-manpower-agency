/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_managment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class data {
    public static Connection getMain()throws Exception{
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_base_management","root","123");
    return c;
    
    
    }
    
}
