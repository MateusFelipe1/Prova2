package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {

 public static void  main (String[] args) throws Exception {
  
    //Jogador (1 Objeto)  
  Jogador Eddy = new Jogador(100, "Eddy", 110, 90.0f);
  
   //Inimigos (2 Objetos)
    Inimigo King = new Inimigo("King", 100, 110, 91.0f);
   
   Inimigo Bruce = new Inimigo(" Bruce", 100, 90 , 86.0f);

   //Luta (1 Objeto)
   Luta luta = new Luta();
   luta.enfrentar(King, Eddy);
   luta.enfrentar(Bruce, Eddy);
   

    

}
 }