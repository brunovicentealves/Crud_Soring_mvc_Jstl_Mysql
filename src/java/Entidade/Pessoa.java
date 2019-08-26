/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author bruno.alves
 */
public class Pessoa {
    
    int id; 
    String nome ;
    String Nacionalidade;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String Nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.Nacionalidade = Nacionalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }
    
    
    
    
}
