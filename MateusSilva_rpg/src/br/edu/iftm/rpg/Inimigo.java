package br.edu.iftm.rpg;

public class Inimigo {
    //Atributos da classe
     private String nome;
     private int vida;
     private int dano;
     private float peso;
 
     //Metodos Constutores
     public Inimigo(String nome, int vida, int dano, float peso) {
      this.nome = nome;
      this.vida = vida;
      this.dano = dano;
      this.peso = peso;
      
    }
 
     //Metodos especificos da classe
       public void status(){
       System.out.println("Estatísticas do Personagem ");
       System.out.println("Nome: " + getNome() );
       System.out.println("Pontos de vida: " + getVida());
       System.out.println("Peso: " + getPeso());
     }
          
     public void atacar(Jogador jogador){
        // Ataca o jogador(O Jogador perde vida igual quantidade de dano do inimigo)
        System.out.println("O " + getNome() + " atacou o " + jogador.getNome() + " e causou " + getDano()
        + " de dano! ");
    
    }
     
    public void perderVida(Jogador jogador) {
     // irá diminuir o total de vida com base no pontos passado por parâmetro.
    //Se após a subtração o valor for igual ou menor a 0, deverá informar que o jogador morreu.      
    if  (dano >= vida){
      System.out.println("O "+ getNome() + " derrotou o " + jogador.getNome() );
  } else {
    System.out.println(" Apos o ataque de " + getNome() +  ".  Restou para " + jogador.getNome() + " " +  (jogador.getVida() - getDano()) + " pontos de vida!" );        
  }
    
    }

    
    // Getters e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso(){
      return peso;
    }
}