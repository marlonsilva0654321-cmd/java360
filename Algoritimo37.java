public class Algoritimo37 {
        void main(){
            /*

            Exemplo Didático:
            
            - Herança
            - Super()
            - Redefinição do Construtor 
            - Polimrfismo
            - Sobrescruta(overside)
            - Sobrecarga

            */
           Cachorro c = new Cachorro("Luiz", "auau.mp3");
           c.comer();
           c.tocarSom();

           Gato g = new Gato ("Juliano", "Soar Miau.mp3");
           g.comer();
           g.tocarSom();

           Porco p = new Porco("Bacon", "OING-OING.mp3");
           p.comer();
           p.tocarSom();

        }
    }
