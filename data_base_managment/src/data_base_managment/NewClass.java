/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_managment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class NewClass {
        public static Connection getagencyConnection () throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/agency","root","123");
        return c;
    
    
    
        }
}
