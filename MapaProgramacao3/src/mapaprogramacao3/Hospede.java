/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprogramacao3;

/**
 *
 * @author Particular
 */
public class Hospede {
    private int codigo;
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    private String nome;
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    private String endereco;
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    private int idade;
    public void setIdade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
