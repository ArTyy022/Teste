package Adversos;

public class Arqueiro extends Principal{
    public Arqueiro (String nome, String arma, String classe, int idade, int vida, int energia){
        super("Jair","Arco", "Arqueiro", 32,110,100);
    }

    public Arqueiro() {
        this.setNome("Lilmar");
        this.setClasse("Arqueiro");
        this.setArma("Arco");
        this.setVida(100);
        this.setEnergia(90);
        this.setIdade(31);

    }

    public void exibirArqueiro(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\nSua classe é " + getClasse() + " e ele usa " +getArma() + " como arma." );
        System.out.println("Sua idade é: " + getIdade() + "\nsua vida é: " + getVida() + " e sua energia é de: " + getEnergia());
    }
}
