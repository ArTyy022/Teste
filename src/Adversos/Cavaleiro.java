package Adversos;

public class Cavaleiro extends Principal{
    public Cavaleiro (String nome, String arma, String classe, int idade, int vida, int energia){
        super();{
            this.setNome("Jailson");
            this.setClasse("Cavaleiro");
            this.setArma("Espada");
            this.setVida(100);
            this.setEnergia(90);
            this.setIdade(26);
        }

    }

    public Cavaleiro() {
        this.setNome("Jailson");
        this.setClasse("Cavaleiro");
        this.setArma("Espada");
        this.setVida(100);
        this.setEnergia(90);
        this.setIdade(26);

    }
@Override
    public void exibir2(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\n Sua classe é " + getClasse() + " e ele usa " +getArma() + " como arma.\n " );

    }



    }

