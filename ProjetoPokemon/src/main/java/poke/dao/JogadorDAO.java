/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke.dao;

import poke.Conector.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        
        String sql = "INSERT INTO cliente (usuario, senha) VALUES(?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, jogador.getUsuario());
        statement.setString(2, jogador.getSenha());
        
        int rowsInserted = statement.executeUpdate();
        
        return (rowsInserted > 0);
        
    }
      
    
    public void close() throws SQLException{
        
        connection.close();
    }
    
    
}
