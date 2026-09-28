public abstract class Veículo {

    /*
    A class abstrata:
       - Ela não pode ser estânciada
       - Ela é um alto nível de gemeralização
       - Ela Possui métodos concretos e contrutores
       - Métodos Abstratos   
    */

    private String placa;
    private String tipoCombustivel;
    private String cor;
    private int velocidadeMax;

    public Veículo() {
        super();
    }

    public Veículo(String placa, String tipoCombustivel, String cor, int velocidadeMax) {
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        this.velocidadeMax = velocidadeMax;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    
    public abstract void mover();
    
}
