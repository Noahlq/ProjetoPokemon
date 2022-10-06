/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke.dao;

import poke.Conector.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import poke.Model.JogadorModel;

/**
 *
 * @author mathe
 */
public class JogadorDAO {
    
    Connection connection;
    
    public JogadorDAO() throws SQLException{
        
        connection = Conector.getConnection();
    }
    
     public boolean inserirJogador(JogadorModel jogador) throws SQLException{
        
        String sql = "INSERT INTO Jogador (usuario, senha) VALUES(?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, jogador.getUsuario());
        statement.setString(2, jogador.getSenha());
        
        int rowsInserted = statement.executeUpdate();
        
        return (rowsInserted > 0);
        
    }
     
     public String checkLogin(String nome, String senha) throws SQLException{
        String check = "";
        
        String sql = "SELECT * FROM Jogador WHERE usuario = ? AND senha = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, nome);
        statement.setString(2, senha);
        
        ResultSet result = statement.executeQuery();
        
        if (result.next()){
            
            check = result.getString(2);
            
        }
    
        return check;
    
    }
      
    
    public void close() throws SQLException{
        
        connection.close();
    }
    
    
}
