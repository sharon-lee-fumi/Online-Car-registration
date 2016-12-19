package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Xiaowen Li
 */
public class ConnControl 
{
    // attributes
    Connection con = null; 
    public Connection connect() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    try{
    // define all connection data 
    String driverName="com.mysql.jdbc.Driver"; 
    String sbUrl="jdbc:mysql://localhost:3306/store"; 
    String userName="root"; 
    String password = "sesame";
    
    // open the connection 
    Class.forName(driverName).newInstance();
    con=DriverManager.getConnection(sbUrl, userName, password); 
    return con;
    } catch(SQLException e){
        return null;}
    } // end of the connect method 
    
    public void freeConnection(Connection c) throws SQLException{
        if(c!=null) 
            c.close();
    }  // the end of the freeConnection method 

}
