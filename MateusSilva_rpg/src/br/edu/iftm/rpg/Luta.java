package br.edu.iftm.rpg;

public class Luta {
    //Atributos da classe
    private Inimigo inimigo;
    private Jogador jogador;


    //Metodos Constutores 


	//Metodos especificos da classe
    public void enfrentar(Inimigo inimigo, Jogador jogador){
    jogador.status();
    System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
    inimigo.status();
    System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
    

    jogador.atacar(inimigo);
    System.out.println();
    inimigo.atacar(jogador);
    System.out.println();
    jogador.perderVida(inimigo );
    System.out.println();        
    inimigo.perderVida(jogador);
    System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");    
        
    }

}
