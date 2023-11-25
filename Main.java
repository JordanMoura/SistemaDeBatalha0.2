class Main {
  public static void main(String[] args) {

    Heroi player1 = new Heroi();
    Heroi player2 = new Heroi();
    Heroi player3 = new Heroi();
    Heroi player4 = new Heroi();
    //
    Vilao vilao1 = new Vilao();
    //
    //Definição herois
    player1.nomeHeroi = "Jordan";
    player1.vidaHeroi = 100.0;
    player1.danoHeroiFraco = 10.0;
    player1.danoHeroiMedio = 20.0;
    player1.danoHeroiForte = 30.0;

    player2.nomeHeroi = "Lucas";
    player2.vidaHeroi = 100.0;
    player2.danoHeroiFraco = 10.0;
    player2.danoHeroiMedio = 20.0;
    player2.danoHeroiForte = 30.0;

    player3.nomeHeroi = "Natan";
    player3.vidaHeroi = 100.0;
    player3.danoHeroiFraco = 10.0;
    player3.danoHeroiMedio = 20.0;
    player3.danoHeroiForte = 30.0;

    player4.nomeHeroi = "Marcos";
    player4.vidaHeroi = 100.0;
    player4.danoHeroiFraco = 10.0;
    player4.danoHeroiMedio = 20.0;
    player4.danoHeroiForte = 30.0;

    //Definição Vilao
    vilao1.nomeVilao ="Thanos";
    vilao1.vidaVilao = 400.0;
    vilao1.danoVilaoFraco = 10.0;
    vilao1.danoVilaoMedio = 20.0;
    vilao1.danoVilaoForte = 30.0;


    Batalha batalha1 = new Batalha();

    batalha1.iniciarBatalha(player1, player2, player3, player4, vilao1);
    
    

    

 
    







   

    


    }}