public class Moto extends Veículo {

    private Boolean temBau;

    public Moto(Boolean temBau) {
        this.temBau = temBau;
    }

    public Moto(String placa, String tipoCombustivel, String cor, int velocidadeMax, Boolean temBau) {
        super(placa, tipoCombustivel, cor, velocidadeMax);
        this.temBau = temBau;
    }

    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

    public void mover(){

        IO.println("A moto se miveu!");
    }


}
