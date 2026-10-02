import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public void main(){  //Arquivo inicial

        int r = 0; //1 continuar no loop, 0 sair do loop

        do{ // inicio do loop
            

                DateTimeFormatter formato = DateTimeFormatter .ofPattern("dd/MM/yyyy HH:mm:ss");//Formato do carimbo

                IO.println("Digite Sua Dúvida - ");
                 // Uma Variavel para armazenar uma dúvida.
                String duvidas = IO.readln();
                //Carimbo capturado no momento registro
                String carimbo = LocalDateTime.now().format(formato);
                

        try(FileWriter arquivo = new FileWriter ("Diário.txt", true  )){

            arquivo.write("[" + carimbo +"]"+ duvidas + "\n");
            IO.println("Registro: [" + carimbo + "] + duvida");
            IO.println("Deseja Registrar nova Mensagem 1-sim 0-nao: ");
                //amanhã - manipular aqui..

            r = Integer.parseInt(IO.readln());

            }catch(Exception e){

              IO.print("Erro ao registrar dua Duvida" + e.getMessage());
            }

            IO.println("adicionar msg:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());
        }while(r==1);

    }    
}
