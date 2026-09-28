public class Carro extends Veículo {

    private int numPortas;
    public Carro(){
        super();
    


    }
    public Carro(int numPortas) {
        this.numPortas = numPortas;
    }
    public Carro(String placa, String tipoCombustivel, String cor, int velocidadeMax, int numPortas) {
        super(placa, tipoCombustivel, cor, velocidadeMax);
        this.numPortas = numPortas;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public void mover (){
    IO.println("O carro se moveu!"); 

    }

}
