  public class AlgoritimoDois {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja Bem vindo ao portal Java 360?");
        String usuario = IO.readln("Qual o Seu nome? ");
        IO.println("Olá "+ usuario + ",Seja Bem Vindo!");
        int estrelas = 0; // mais rápidos sem métodos 
        Integer estrelasInteger = 0; // mais lento com métodos (Valor da convenrção)
        int estrlas = 0;
        IO.println("Quem cirou o Java");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates ");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zukerberg");
        int resp = Integer.parseInt(IO.readln ("Digite um Número:"));
        if (resp == 1) {
            IO.println("Parabéns, vc acertou!");
            estrelas = estrelas + 1;
        }else{
            IO.println("VC Errou kkk!");

        IO.println("Obteve " + estrelas + " estrelas");


        }

        
            // integer é uma classe
    }
}
