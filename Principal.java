public class Principal {
    void main(){
        Algoritimo31 objeto = new Algoritimo31();
        IO.println(objeto.getAloMundo());
        objeto.printarNaTela();
        Algoritimo32 objeto2 = new Algoritimo32();
        String nome = IO.readln("Digite Seu Nome - ");
        objeto2.mostrarSalaEco("PÃO DE QUEIJO");
        objeto2.mostrarSalaEco(nome);

        Algoritimo32 objeto3 = new Algoritimo32();
        IO.println(objeto3.mostrarSala("BeiÇola"));

    }
    
}
