/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap03.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author IngEspino
 */
public class Cap03Demo {

    /**
     * @param args the command line arguments
     */
    /* CONSTANTES */
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dbprueba";

    public static void main(String[] args) {
        // TODO code application logic here
        // parametros de la conexion

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM paises");
            while (resultSet.next()) {
                System.out.printf("%s\t%s.\t\n", resultSet.getString("capital"), 
                        resultSet.getString("nombre"));
            }
        } catch (SQLException ex) {
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
            }
        }
    }
}
