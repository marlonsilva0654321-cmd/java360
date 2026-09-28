public class Porco extends Animal {

    public Porco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub

    }

    @Override
    public void comer() {
        IO.println("Lavagem");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
        
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("OING-OING.mp3");
        throw new UnsupportedOperationException("Unimplemented method 'tocarSom'");
    }
    

}
