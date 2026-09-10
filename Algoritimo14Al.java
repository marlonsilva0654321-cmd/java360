public class Algoritimo14Al {
    public static void main (String[] args){

        int opcao;
        
     
        IO.println("Jogo Inicializado");
        IO.println("-----------------");
        IO.println("Suas Vidas Estão Acabando");
        IO.println("-------------------------");
        IO.println("GAME-OVER");
        IO.println("-------------------------");
        IO.println("Número Inválido");
        IO.println("-------------------------");

        opcao = Integer.parseInt(IO.readln("Digite Um Número - "));

        switch (opcao){

           case  1:
             IO.println("Jogo Iniciado");
             break;

           case  2:
            IO.println("Suas Vidas Estão Acabando");
            break;
           case 3: 
           IO.println("GAME-OVER!");
           break;
          default:
            IO.println("Número Inválido"); 


        }

    }
}
