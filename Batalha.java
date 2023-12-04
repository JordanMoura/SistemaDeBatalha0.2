import java.util.Random;
import java.util.Scanner;



 class Batalha{

  void iniciarBatalha(Heroi player1, Heroi player2, Heroi player3, Heroi player4, Vilao vilao1){
    Scanner read = new Scanner(System.in);
   
    
    
    
    
    
    
    
    
    
  
    
    ///////// Tela principal batalha /////////
      System.out.println("-----Batalha Iniciada-----\n\n");

   


    while(vilao1.vidaVilao > 0 && (player1.vidaHeroi > 0 || player2.vidaHeroi > 0 || player3.vidaHeroi >0 || player4.vidaHeroi > 0)){
      
      System.out.println(vilao1.nomeVilao+"\nHP: "+vilao1.vidaVilao);
     System.out.println("===============");


    System.out.println("\n\n\n");
    System.out.println(player1.nomeHeroi+"\nHP: "+player1.vidaHeroi);
    System.out.println("===============");
    System.out.println(player2.nomeHeroi+"\nHP: "+player2.vidaHeroi);
    System.out.println("===============");
    System.out.println(player3.nomeHeroi+"\nHP: "+player3.vidaHeroi);
    System.out.println("===============");
    System.out.println(player4.nomeHeroi+"\nHP: "+player4.vidaHeroi);
    System.out.println("===============");

    System.out.println("\n\n");


    //// Alterar para funcionar por meio da velocidade ao inves do dado
    System.out.println("Jogando Dados:");
    Random random = new Random();
    int dado = random.nextInt(5) + 1;
    System.out.println("Dado = "+dado);
    System.out.println("\n");




    //Variaveis usadas somente na batalha
    String nomeHeroiAlvo;
    double danoAtual = 0;



    ////Turno do vilao
    if(dado == 1){

      
     
      //Definir qual ataque o vilao vai usar
      int ataqueVilao = random.nextInt(3) + 1;
      switch(ataqueVilao){
          case 1: danoAtual = vilao1.danoVilaoFraco; break;
          case 2: danoAtual = vilao1.danoVilaoMedio; break;
          case 3: danoAtual = vilao1.danoVilaoForte; break;
          
      }
      
      
      
      
      
      //Definir quem vilao vai atacar
      int heroiAlvo = random.nextInt(4) + 1;
      

      if(heroiAlvo == 1){
        player1.vidaHeroi = player1.vidaHeroi - danoAtual;
        nomeHeroiAlvo = player1.nomeHeroi;
        }else if(heroiAlvo == 2){
        player2.vidaHeroi = player2.vidaHeroi - danoAtual;
        nomeHeroiAlvo = player2.nomeHeroi;
      }else if(heroiAlvo == 3){
        player3.vidaHeroi = player3.vidaHeroi - danoAtual;
        nomeHeroiAlvo = player3.nomeHeroi;
      }else{
        player4.vidaHeroi = player4.vidaHeroi - danoAtual;
        nomeHeroiAlvo = player4.nomeHeroi;
        }
      System.out.println("\n\n"+vilao1.nomeVilao+" Ataca "+nomeHeroiAlvo+" e causa: "+danoAtual+" de dano");
   
    
    
    
    //Trurno Heroi
    }else{
      



      //Definir de qual heroi é o turno                                             
          //+++++falta definir vida,dano e itens de cada heroi para heroiAtual
          // Ou seja nessa parte HeroiAtual deve receber todos os atributos do heroi selecionado
      Heroi playerAtual = new Heroi();
       if(dado == 2){
         playerAtual = player1;
       }else if(dado == 3){
         playerAtual = player2;
       }else if(dado == 4){
         playerAtual = player3;
       }else{
         playerAtual = player4;
       }  
      
      






      if(playerAtual.vidaHeroi > 0){ // Se o heroi tiver vida
           System.out.println(playerAtual.nomeHeroi+" esta atuando!");
           System.out.println("Oque deseja fazer?");
           System.out.println("1-Atacar");
           System.out.println("2-Usar item da bolsa");
           System.out.println("3-Fugir");
           int escolha = read.nextInt();
           int escolhaAtaque = 0;
          System.out.println("\n\n");

          if(escolha < 1 || escolha > 3){
            System.out.println("Escolha invalida, Digite novamente:");

          }else if(escolha == 1){

            //////Menu de ataques
            while(escolhaAtaque != 1 && escolhaAtaque != 2 && escolhaAtaque != 3){
            System.out.println("1-Ataque leve");
            System.out.println("2-Ataque rapido");
            System.out.println("3-Ataque pesado");
            
            escolhaAtaque = read.nextInt();


              //Definir o dano Atual

            if(escolhaAtaque < 1 || escolhaAtaque > 3){
              System.out.println("Escolha invalida, Digite novamente:");
            }else if(escolhaAtaque == 1){
              danoAtual = playerAtual.danoHeroiFraco;
              vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
            }else if(escolhaAtaque == 2){
              danoAtual = playerAtual.danoHeroiMedio;
              vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
            }else{
              danoAtual = playerAtual.danoHeroiForte;
              vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
            }

            System.out.println("\n\n");
          }// laço escolha ataque

            System.out.println(playerAtual.nomeHeroi+" Ataca "+vilao1.nomeVilao+" e causa "+danoAtual+" de dano");
          }
      }else{ // Se o heroi não tiver vida

        System.out.println("O heroi "+playerAtual.nomeHeroi+" esta morto! \n\n Dado sera Jogado novamente: \n");
        
      }































      } // turno player



    } // laço repeticao prncipal

    if(vilao1.vidaVilao <= 0){
      System.out.println(vilao1.nomeVilao+ " Morreu");	
    }else{
      System.out.println("----------GAME OVER------------");
    }

    















    
}}