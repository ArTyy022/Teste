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
        
        System.out.println("1 Cavaleiro");
        System.out.println("2 Arqueiro");
        System.out.println("3 Barbaro");
        int escolha = scanner.nextInt();


        Barbaro barbaro = new Barbaro();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();


        if (escolha == 1 ){
            cavaleiro.exibirCavaleiro();
        } else if (escolha == 2) {
            arqueiro.exibirArqueiro();
        } else if (escolha == 3){
            barbaro.exibirBarbaro();
        }






    }
}