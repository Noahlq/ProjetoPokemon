/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke.Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NoahRohrbach
 */
public class Conector {
    
    static String urlBD = "jdbc:mysql://localhost:3306/projetopokemon";
    static String username = "root";
    static String password = "2657";
    
    public static Connection getConnection() throws SQLException{
        
        Connection connection = null;
        
        connection = DriverManager.getConnection(urlBD, username, password);
                
        return connection;
        
    }
    
    
    
}
