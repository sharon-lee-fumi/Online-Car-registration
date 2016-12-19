package data;

import business.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Xiaowen Li
 */
public class CarDB
{
    public static int insert(Car c) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        // define local objects that will be used in the insert process
        PreparedStatement ps = null;
        Connection myCon = null;
        ConnControl conManager = null;
        try
        {
            // we will try to insert the data 
            String pstm = "INSERT INTO cars(carId,model,year,color)VALUES(?,?,?,?)";
            // establish the connection
            conManager = new ConnControl();
            myCon = conManager.connect();
            
            // create the preparedstatement object 
            ps = myCon.prepareStatement(pstm);

            // set the parameters of the sql statement object
            ps.setInt(1, c.getCarId());
            ps.setString(2, c.getModel());
            ps.setInt(3, c.getYear());
            ps.setString(4, c.getColor());

            // execute the statement 
            return ps.executeUpdate(); // return 1 if the insertion succeed

        } catch (SQLException e)
        {
            return 0;

        }

    }   // end of inset method

    public static ResultSet showAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        // this is an empty table will be filled up
        // define object that will be used to retrive the data
        Statement stm;
        Connection myCon;
        ConnControl conManager;
        ResultSet res;

        try
        {
            // write the sql statement text
            String stmString = "select * from cars;";

            // connect to the MySql server and hence the database
            conManager = new ConnControl();
            myCon = conManager.connect();

            // create a statement object and excute it
            stm = myCon.createStatement();
            res = stm.executeQuery(stmString);

            // return r
            return res;

        } catch (SQLException ex)
        {
            return null;
        }
    }

    public static ResultSet search(String s) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        // this is an empty table will be filled up
        // define object that will be used to retrive the data
        Statement stm;
        Connection myCon;
        ConnControl conManager;
        ResultSet res;

        try
        {
            // write the sql statement text
            String stmString = "select * from cars where " + s + ";";

            // connect to the MySql server and hence the database
            conManager = new ConnControl();
            myCon = conManager.connect();

            // create a statement object and excute it
            stm = myCon.createStatement();
            res = stm.executeQuery(stmString);

            // return r
            return res;

        } catch (SQLException ex)
        {
            return null;
        }
    }

}
