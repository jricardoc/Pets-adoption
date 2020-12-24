package adocaopets;

import java.util.ArrayList;
import java.util.Scanner;

public class AdocaoPets {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Luke", Pet.RACAS[0], 1, 10.5, 'M');
        Pet pet2 = new Pet("Antonio", Pet.RACAS[1], 2, 15.5, 'M');
        Pet pet3 = new Pet("Fernanda", Pet.RACAS[2], 4, 9.5, 'F');
        Pet pet4 = new Pet("Claudia", Pet.RACAS[3], 5, 13.5, 'F');

        ArrayList<Pet> arraydePet = new ArrayList<Pet>(4);
        arraydePet.add(pet1);
        arraydePet.add(pet2);
        arraydePet.add(pet3);
        arraydePet.add(pet4);

        Responsavel responsavel = new Responsavel("999.999.999-99", "Cristiano Neymar", 36);
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1) Adotar pet;\n 2) Listar pets adotados;\n 3) Listar pets restantes;\n 4) Sair.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    realizarAdocao(responsavel, arraydePet, sc);
                    break;

                case 2:
                    listarPetsAdotados(responsavel);
                    break;

                case 3:
                    listarPetsRestantes(arraydePet);
                    break;

            }
            
            System.out.println("///////////////////////////////////");
        } while (opcao != 4);

    }

    private static void realizarAdocao(Responsavel r, ArrayList<Pet> petsParaAdocao, Scanner sc) {
        System.out.println("Informe qual pet deseja adotar ou pressione 0 para voltar: ");
        for (int i = 1; i <= petsParaAdocao.size(); i++) {
            System.out.println(i + " - " + petsParaAdocao.get(i - 1).getInfoPet());
        }
        int numeroPet = sc.nextInt();
        if (numeroPet == 0) {
            return;
        }
        Pet candidato = petsParaAdocao.get(numeroPet - 1);
        if (r.adotarPet(candidato)) {
            petsParaAdocao.remove(candidato);
            System.out.println("Pet " + numeroPet + " adotado com sucesso por:\n" + r.getInfoResponsavel());
        }
    }

    private static void listarPetsAdotados(Responsavel r) {
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(r.listarPets());
    }

    private static void listarPetsRestantes(ArrayList<Pet> petsParaAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsParaAdocao) {
            System.out.println(p.getInfoPet());
        }
    }

}
