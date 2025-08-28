package Adversos;

public class Barbaro extends Principal{
    public Barbaro(String nome, String arma, String classe, int idade, int vida, int energia) {
        super("jorisvaldo", "Machado", "Barbaro", 45, 130, 50);

    }

    public Barbaro() {

    }

    public void exibirBarbaro(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\n Sua classe é " + getClasse() + " e ele usa " +getArma() + " como arma.\n " );
        System.out.println("Sua idade é: " + getIdade() + "\n sua vida é: " + getVida() + " e sua energia é de: " + getEnergia());



    }
}
