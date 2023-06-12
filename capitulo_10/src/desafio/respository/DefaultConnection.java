package desafio.respository;

//@author Allan Toledo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DefaultConnection {
    public static Connection getConnection() throws SQLException {
        //Class.forName("org.postgresql.Driver"); // registra o driver
        return DriverManager.getConnection(
                    "jdbc:postgresql://172.17.0.2:5432/escola", "postgres", "123456"); 
    }
}
