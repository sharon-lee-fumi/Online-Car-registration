package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Xiaowen Li
 */
public class DBUtil 
{
    public static void closeStatement(Statement s)throws SQLException
    {
        if(s!=null)
            s.close();
    } // the end of closestatement method 
    
    public static void closePreparedStatement(PreparedStatement ps) throws SQLException
    {
        if(ps!=null)
            ps.close();
    } // this is the end of close preparedstatment method 
    
    public static void closeResultset(ResultSet r) throws SQLException
    {
        if(r!=null)
            r.close();
    }
    
}
