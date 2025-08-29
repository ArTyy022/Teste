package Adversos;

public class Barbaro extends Principal{
    public Barbaro(String nome, String arma, String classe, int idade, int vida, int energia) {
        super();



    }

    public Barbaro() {
        this.setNome("Miqueias");
        this.setClasse("Barbaro");
        this.setArma("Machado");
        this.setVida(120);
        this.setEnergia(70);
        this.setIdade(42);

    }

    public void exibirBarbaro(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\nSua classe é " + getClasse() + " e ele usa " +getArma() + " como arma." );
        System.out.println("Sua idade é: " + getIdade() + "\nsua vida é: " + getVida() + " e sua energia é de: " + getEnergia());



    }
}
