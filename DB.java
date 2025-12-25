
package Appiontment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    public static Connection getConnection() {
        Connection con;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/College";
            String user = "root";
            String pass = "Atef1967";

            con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}