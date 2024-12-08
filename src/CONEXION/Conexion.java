package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {
        try {

            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost/DriveLux", "postgres", "password");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return null;
    }
}
