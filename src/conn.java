import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebc", "root", "Sahil@3008");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
