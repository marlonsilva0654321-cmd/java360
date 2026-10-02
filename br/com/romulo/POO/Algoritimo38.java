import javax.swing.JOptionPane;

public class Algoritimo38 {

    /*
    Básica:
    Pbjeto
    Classe 
    Métodos Workes
    Construtor 
    Get Set

     Avançado
    Herança
    Clase Abstrata
    Encapsulamento
    Interfaces
    Comparativo
    Static
    
    */
    public void main(){

        JOptionPane.showMessageDialog(null, "Agência SenaiCar");
        Carro c = new Carro("PWP", "hibrido flex", "Azul", 220, 4);
        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getCor());
        JOptionPane.showConfirmDialog(null, c.getTipoCombustivel());
        JOptionPane.showConfirmDialog(null, c.getNumPortas());
        JOptionPane.showConfirmDialog(null, c.getVelocidadeMax());
        c.mover();



    }
    
}
