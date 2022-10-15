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
import java.util.ArrayList;
import java.util.List;
import poke.Model.PokemonModel;

/**
 *
 * @author mathe
 */
public class PokemonDAO {
    
     Connection connection;
    
    public PokemonDAO() throws SQLException{
        
        connection = Conector.getConnection();
    }
    
   public List<PokemonModel> selecionarPokemon(int id_p) throws SQLException{
        
        String sql = "SELECT nome_p FROM pokemon WHERE id_p = ?";

        
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        
        List<PokemonModel> pokemons = new ArrayList<>();
        
        while(result.next()){
                        
            PokemonModel poke = new PokemonModel(result.getString(1));
            poke.setId_p(id_p);
           
            pokemons.add(poke);
            
        }
       
        
        return pokemons;
    
    }
    
}
