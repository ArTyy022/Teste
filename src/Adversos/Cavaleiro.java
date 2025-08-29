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

    public void exibirCavaleiro(){
        System.out.println("O nome do campeão escolhido é " + getNome() + "\nSua classe é " + getClasse() + " e ele usa " +getArma() + " como arma." );
        System.out.println("Sua idade é: " + getIdade() + "\nsua vida é: " + getVida() + " e sua energia é de: " + getEnergia());
    }



    }

