public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
        //Redefinir o Construtor no filho
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Ração Camil para Cães");
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        System.out.println("Tocando auau.mp3");
        throw new UnsupportedOperationException("Unimplemented method 'tocarSom'");

        //NO PROCESSO  de Herança o construtor não é herdado
    }
    
}
