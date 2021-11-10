
package login_register_design;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;

/**
 *
 * @author gilmorer2
 */
public class My_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "the_deliverables";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static void main(String args[]) {
    	getConnection();
    }
    
    
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
            System.out.println("connection established");
        } catch (SQLException ex) {
            Logger.getLogger(" Get Conection -> " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("connection not established");
        }
        
        
        return cnx;
    }        
            
}

	
	/*public static void main(String args[]) {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			if (!con.isClosed())
				System.out.println("Successfully connected to MySQL server...");
			}catch(Exception e) {
				System.err.println("Exception: "+e.getMessage());
				} finally {
					try {
						if (con!=null)
							con.close();
						} catch(SQLException e) {}
			}
		}
}
	
*/	
	
	
	
	
	
	