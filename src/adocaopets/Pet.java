/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adocaopets;

/**
 *
 * @author ricar
 */
public class Pet {
    
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private char sexo;
    
    public static final String[] RACAS = new String[]{"Vira-Lata", "Labrador", "Pastor Alemão", "São Bernardo"};

    public Pet(String nome, String raca, int idade, double peso, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    
    public String getInfoPet() {
        String ret = "";
        ret = ret.concat(this.nome).concat(", ").concat(this.raca).concat(", ").concat(Integer.toString(this.idade));
        ret = ret.concat(Double.toString(this.peso)).concat(", ").concat(Character.toString(this.sexo));
   
        return ret;
    }
    
}
