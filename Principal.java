public class Principal {
    public void main(){
        IO.println("Bar do galego \n");
        String iciciação = IO.readln("No Que podemos ajudar?:");
        String nomeProduto = IO.readln("Digite o nome do Produto:");
        int qtde = Integer.parseInt(IO.readln("digite a quantidade:"));
        double preco = Double.parseDouble(IO.readln("digite o preço (por unidade):"));

        double valorTotal = qtde * preco; //Operador aritimético de multiplicação
        IO.println("nome do Produto:" +nomeProduto+"\n Valor Total:" +valorTotal);
        IO.println("nome do Produto:");
        IO.println("Valor total:" + valorTotal);


        String fornecedor = IO.readln("digite o nome do fornecedor:");
        String telefone = IO.readln("digite o telefone do fornecedor:");
        String email = IO.readln("digite o email do fornecedor:");
        String observação = IO.readln("Terias alguma Observçâo?-");
        boolean ativo = Boolean.parseBoolean(IO.readln(" fornecedor está ativo:"));


        IO.println("nome do fornecedor:" +fornecedor);
        IO.println("telefone do fornecedor:" +telefone);
        IO.println("email do fornecedor:" +email);
        IO.println("Observação:" +observação);
        IO.println("fornecedor ativo:" +ativo);

        if (ativo == true) {
            System.out.println("Forncedor Ativo");
        }else {
            IO.println("Fornecedor Inativo");

        }

        String nomeCliente = IO.readln("digite o nome do cliente:");
        int qtdeEstrelas = Integer.parseInt(IO.readln("quantas estrelas?"));

        if(qtdeEstrelas >=4) {
            IO.println("ClienteVip:" + nomeCliente);
        } else{
            IO.println("Cliente Normal:" + nomeCliente);

        }

   }
        //
        // println - quebra a linha
        // Print - Não quebra a linha
        // ex: IO.print
        //Tipo primitivo(valor)
        //tipo primitivo (valor real) - float (2x float = double
        //operadores aritimeticos: + - * / %
        //Operadores relacionais: == != > <>= <=
        //Operadores lógicos:
        //&& (E)  (OU) ! (NÃO)


}
