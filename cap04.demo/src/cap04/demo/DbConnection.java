/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap04.demo;
import java.sql.*;
/**
 *
 * @author IngEspino
 */
public class DbConnection {
    /**Parametros de conexion*/
   static String bd = "dbprueba";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://127.0.0.1:3306/"+bd;

   Connection connection = null;

   /** Constructor de DbConnection */
   public DbConnection() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);

         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }

   public void desconectar(){
      connection = null;
   }
}
