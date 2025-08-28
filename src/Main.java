import Adversos.Arqueiro;
import Adversos.Barbaro;
import Adversos.Cavaleiro;
import Adversos.Principal;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
    Principal principal = new Principal();
    Scanner scanner = new Scanner(System.in);
    

        System.out.println("Escolha um campeão");
        
        System.out.println("1 Barbaro");
        System.out.println("2 Arqueiro");
        System.out.println("3 Cavaleiro");
        scanner.nextInt();


        Barbaro barbaro = new Barbaro();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        int escolha = 0;
        if (escolha == 1 ){
            barbaro.exibirBarbaro();
            System.out.println("O nome do seu campeão é: " + barbaro.getNome() + " sua classe é : " + barbaro.getClasse());
        } else if (escolha == 2) {
            System.out.println();
        } else if (escolha == 3){
            System.out.println();
        }

    principal.exibir2();




    }
}