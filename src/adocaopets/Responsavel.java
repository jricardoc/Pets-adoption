package adocaopets;

import java.util.ArrayList;

public class Responsavel {

    private String CPF;
    private String nome;
    private int idade;
    private ArrayList<Pet> petsAdotados;

    public Responsavel(String CPF, String nome, int idade) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.petsAdotados = new ArrayList<Pet>();
    }

    public boolean adotarPet(Pet pet) {
        if (idade >= 18) {
            petsAdotados.add(pet);
            return true;
        } else {
            return false;
        }
    }

    public String listarPets() {
        String ret = "";
        for (int i = 0; i < petsAdotados.size(); i++) {
            ret = ret.concat(petsAdotados.get(i).getInfoPet()).concat("\n");
        }
        return ret;
    }

    public String getInfoResponsavel() {
        String ret = "";
        ret = ret.concat(this.CPF).concat(", ").concat(this.nome).concat(", ").concat(Integer.toString(this.idade));
        return ret;
    }
}
