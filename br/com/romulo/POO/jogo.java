import javax.swing.*;
import java.awt.*;

public class jogo  {

    public static void main(String[] args) {

        JFrame janela = new JFrame("SENATECH Bank");

        JLabel usuarioLabel = new JLabel("Usuário:");
        JTextField usuario = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senha = new JPasswordField();

        JButton botao = new JButton("Entrar");

        janela.setLayout(new GridLayout(3, 2));

        janela.add(usuarioLabel);
        janela.add(usuario);

        janela.add(senhaLabel);
        janela.add(senha);

        janela.add(new JLabel(""));
        janela.add(botao);

        janela.setSize(200, 100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

