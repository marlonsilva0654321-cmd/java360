public class Gato extends Animal {

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Beber leite ");
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public void tocarSom() {
        IO.println("Soar miau" + super.getArquivoSom());
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocarSom'");
    }
    
    
}
