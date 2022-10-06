/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke.Model;

/**
 *
 * @author mathe
 */
public class JogadorModel {
    
    private String usuario, senha;
    
    
    public JogadorModel(String usuario, String senha){
        
        this.usuario = usuario;
        this.senha = senha;
        
        
    }
    
    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
