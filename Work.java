public class Work {
    public static void main(String[] args){

        String nome;
        int valor;

        IO.println("Olá, Seja Bem Vindo");
        nome = IO.readln("Por Favor Digíte seu nome - ");
        IO.println("Olá " + nome);
        valor = Integer.parseInt(IO.readln(nome + ", Por favor Digíte o valor da Sua Compra - "));

        if (valor >= 200){
            IO.println(nome + ", Pelo O Que Estou Vendo Aqui, Vc Tem 20% de Desconto" );
        }else if(valor >= 100){
            IO.println(nome + ", Pelo O Que Estou Vendo Aqui, Vc Tem 10% de Desconto");
        }else{
            IO.println("Vai pra La pobre");

        }
    
    }

}