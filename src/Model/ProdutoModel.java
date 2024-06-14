/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Gabriel
 */
public class ProdutoModel {
    private int ID;
    private String nome;
    private int preco;
    
    public ProdutoModel(int ID, String nome, int preco){
     this.ID = ID;
     this.nome = nome;
     this.preco = preco;
    }
    
    
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }
    
}
