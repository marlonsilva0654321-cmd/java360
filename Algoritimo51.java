import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritimo51 {
    public void main(){
        double resultado = 0;

        //Criar uma calculador,
        //Que Só tem a operação de divisão,
        //Tartar uma exeção de um numero por zero,
        //Use o Robozinho;

        try {

        int d1;
        int d2;
        d1 = Integer.parseInt(IO.readln("Digite um numero - "));
        d2 = Integer.parseInt(IO.readln("Digite um numero - "));

        resultado = d1 / d2;

        }catch(NumberFormatException e){
            IO.println(e.getMessage() + "   Ô MIZERA!!!!!! É UM NÚMERO, NÚMERO");

        }catch(ArithmeticException e){    

            IO.println("0 Não é divizível , Zé ");

        }finally{
            IO.println("O Resultado é " + resultado);

        }

    }
}
