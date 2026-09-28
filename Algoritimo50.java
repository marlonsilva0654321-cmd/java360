public class Algoritimo50 {
    public void main(){

        try{ // tentar

        int idade = Integer.parseInt(IO.readln("Digite a Sua Idade - "));
        String resultado = (idade >= 18) ? "Maior" : "Menor";
        IO.println(resultado);

        }catch(NumberFormatException e){ 
            //erro
            //e.getMessage() - Quando estiver na Web Use print() Consle()
            IO.println("🙊" + e.getMessage()+ "   Ô Mizera!! Isso não é um númeroooooo!!!!");

        }finally{
            //conclusão (independe se deu certo ou errado)
            IO.println("🙊 - Pode Entrar");
        }
    }
}
