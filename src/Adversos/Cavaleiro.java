package Adversos;

public class Cavaleiro extends Principal{
    public Cavaleiro (String nome, String arma, String classe, int idade, int vida, int energia){
        super("Lamar","Espada","Cavaleiro",23,100,90);
    }
    public void exibirCavaleiro(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\n Sua classe é " + getClasse() + " e ele usa " +getArma() + " como arma.\n " );
        System.out.println("Sua idade é: " + getIdade() + "\n sua vida é: " + getVida() + " e sua energia é de: " + getEnergia());

    }


    public Cavaleiro() {

    }
}
