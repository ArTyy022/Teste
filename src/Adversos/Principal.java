package Adversos;

public class Principal {
    private String nome;
    private String arma;
    private String classe;
    private int idade;
    private int vida;
    private int energia;

    public Principal(String nome, String arma, String classe,
      int idade, int vida, int energia){
        this.nome = nome;
        this.arma = arma;
        this.classe = classe;
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public Principal() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }





    public void exibir2 (){


    }


}
