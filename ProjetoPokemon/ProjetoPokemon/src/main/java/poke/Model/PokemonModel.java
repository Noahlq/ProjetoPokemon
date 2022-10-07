/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke.Model;

/**
 *
 * @author mathe
 */
public class PokemonModel {
    
    String nome_p, tipo_p, tipo2_p;
    int nivel_p, vida_p, ataque_p, velocidade_p;         
    float peso_p, tamanho_p;
    
    public PokemonModel(String nome_p, String tipo_p, String tipo2_p, int nivel_p, int vida_p, int ataque_p, int velocidade_p, float peso_p, float tamanho_p){
        
        this.nome_p = nome_p;
        this.tipo_p = tipo_p;
        this.tipo2_p = tipo2_p;
        this.nivel_p = nivel_p;
        this.vida_p = vida_p;
        this.ataque_p = ataque_p;
        this.velocidade_p = velocidade_p;
        this.peso_p = peso_p;
        this.tamanho_p = tamanho_p;
          
    }

    public String getNome_p() {
        return nome_p;
    }

    public void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }

    public String getTipo_p() {
        return tipo_p;
    }

    public void setTipo_p(String tipo_p) {
        this.tipo_p = tipo_p;
    }

    public String getTipo2_p() {
        return tipo2_p;
    }

    public void setTipo2_p(String tipo2_p) {
        this.tipo2_p = tipo2_p;
    }

    public int getNivel_p() {
        return nivel_p;
    }

    public void setNivel_p(int nivel_p) {
        this.nivel_p = nivel_p;
    }

    public int getVida_p() {
        return vida_p;
    }

    public void setVida_p(int vida_p) {
        this.vida_p = vida_p;
    }

    public int getAtaque_p() {
        return ataque_p;
    }

    public void setAtaque_p(int ataque_p) {
        this.ataque_p = ataque_p;
    }

    public int getVelocidade_p() {
        return velocidade_p;
    }

    public void setVelocidade_p(int velocidade_p) {
        this.velocidade_p = velocidade_p;
    }

    public float getPeso_p() {
        return peso_p;
    }

    public void setPeso_p(float peso_p) {
        this.peso_p = peso_p;
    }

    public float getTamanho_p() {
        return tamanho_p;
    }

    public void setTamanho_p(float tamanho_p) {
        this.tamanho_p = tamanho_p;
    }
       
    
}
