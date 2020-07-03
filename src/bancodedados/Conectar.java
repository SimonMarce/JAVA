/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

/**
 *
 * @author 
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conectar {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/senai";
        try {
            return (Connection) DriverManager.getConnection(url, "root", "Anonymous##123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String arg[]) throws SQLException {
        Connection conectar = new Conectar().getConnection();
        System.out.println("Funfou!!!");
        conectar.close();

    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
