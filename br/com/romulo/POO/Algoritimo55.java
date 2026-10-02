import java.util.HashMap;

import java.util.Map;

import java.io.File;

import java.io.FileWriter;

import java.io.FileReader;

import java.io.BufferedReader;

import javax.swing.JOptionPane;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Algoritimo55 {

    public static void main(String[] args) {

        int opcao;

        Map<String, String> ambientes = new HashMap<>();

        File arquivo = new File("Ambientes.txt");

        do {

            JOptionPane.showMessageDialog(
                null,
                "Olá, Seja Bem-Vindo!\n\n" +
                "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Pesquisar\n" +
                "4 - Excluir\n" +
                "5 - Alterar\n" +
                "6 - Sair"
            );

            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Digite o Número da Opção:"
                )
            );

            switch (opcao) {

                case 1:

                    try {

                        String codigoCadastrado =
                            JOptionPane.showInputDialog(
                                "Digite o Código do Ambiente:"
                            );

                        String nomeCadastrado =
                            JOptionPane.showInputDialog(
                                "Digite o Nome do Ambiente:"
                            );

                        ambientes.put(
                            codigoCadastrado,
                            nomeCadastrado
                        );

                        LocalDateTime agora =
                            LocalDateTime.now();

                        DateTimeFormatter formato =
                            DateTimeFormatter.ofPattern(
                                "dd/MM/yyyy HH:mm"
                            );

                        String dataHora =
                            agora.format(formato);

                        FileWriter escritor =
                            new FileWriter(arquivo);

                        for (Map.Entry<String, String> ambiente :
                             ambientes.entrySet()) {

                            escritor.write(
                                ambiente.getKey()
                                + " - "
                                + ambiente.getValue()
                                + "\n"
                            );
                        }

                        escritor.close();

                        JOptionPane.showMessageDialog(
                            null,
                            "Ambiente cadastrado!\n" +
                            "Data: " + dataHora
                        );

                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um erro."
                        );
                    }

                    break;


                case 2:

                    try {

                        FileReader leitorArquivo =
                            new FileReader(arquivo);

                        BufferedReader leitor =
                            new BufferedReader(leitorArquivo);

                        String linha =
                            leitor.readLine();

                        ambientes.clear();

                        while (linha != null) {

                            String[] partes =
                                linha.split(" - ");

                            if (partes.length >= 2) {

                                ambientes.put(
                                    partes[0],
                                    partes[1]
                                );
                            }

                            linha = leitor.readLine();
                        }

                        leitor.close();

                        String lista = "";

                        for (Map.Entry<String, String> ambiente :
                             ambientes.entrySet()) {

                            lista +=
                                ambiente.getKey()
                                + " - "
                                + ambiente.getValue()
                                + "\n";
                        }

                        JOptionPane.showMessageDialog(
                            null,
                            lista
                        );

                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um erro ao ler o arquivo."
                        );
                    }

                    break;


                case 3:

                    String codigo =
                        JOptionPane.showInputDialog(
                            "Digite o Código do Ambiente:"
                        );

                    String resultado =
                        ambientes.get(codigo);

                    JOptionPane.showMessageDialog(
                        null,
                        resultado
                    );

                    break;


                case 4:

                    try {

                        String codigoExclusao =
                            JOptionPane.showInputDialog(
                                "Digite o Código do Ambiente:"
                            );

                        ambientes.remove(codigoExclusao);

                        FileWriter escritor =
                            new FileWriter(arquivo);

                        for (Map.Entry<String, String> ambiente :
                             ambientes.entrySet()) {

                            escritor.write(
                                ambiente.getKey()
                                + " - "
                                + ambiente.getValue()
                                + "\n"
                            );
                        }

                        escritor.close();

                        JOptionPane.showMessageDialog(
                            null,
                            "Ambiente excluído!"
                        );

                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um erro ao excluir."
                        );
                    }

                    break;


                case 5:

                    try {

                        String codigoAlteracao =
                            JOptionPane.showInputDialog(
                                "Digite o Código do Ambiente:"
                            );

                        String novoNome =
                            JOptionPane.showInputDialog(
                                "Digite o Novo Nome do Ambiente:"
                            );

                        ambientes.put(
                            codigoAlteracao,
                            novoNome
                        );

                        FileWriter escritor =
                            new FileWriter(arquivo);

                        for (Map.Entry<String, String> ambiente :
                             ambientes.entrySet()) {

                            escritor.write(
                                ambiente.getKey()
                                + " - "
                                + ambiente.getValue()
                                + "\n"
                            );
                        }

                        escritor.close();

                        JOptionPane.showMessageDialog(
                            null,
                            "Ambiente alterado!"
                        );

                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um erro ao alterar."
                        );
                    }

                    break;


                case 6:

                    JOptionPane.showMessageDialog(
                        null,
                        "Programa encerrado!"
                    );

                    break;


                default:

                    JOptionPane.showMessageDialog(
                        null,
                        "Opção inválida!"
                    );

                    break;
            }

        } while (opcao != 6);
    }
}