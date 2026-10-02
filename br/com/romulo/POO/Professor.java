public class Professor {
    //Variavel é um espaço reservado na memoria ram
    //Classe é esse titulo "Public class"
    String nome;
    private String escolaridade;
    private String dataNascimento;
    public int idade;
    public Professor (){
        //Construtor vazio
    }
    public Professor (String nome, String escolaridade, String dataNascimento) {
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.dataNascimento = dataNascimento;
    }
    public Professor(String nome, String escolaridade) {
        this.nome = nome;
        this.escolaridade = escolaridade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String gatNome() {
        return nome;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    //Cosntor é um recurso especial para criar o objeto, Serve para criar o objeto
    //
    //Overload - serve para pasagem de valor 
    //Identeção - um paragrafo 
    //sobrecarga - possibilidade de criar varios construtires com estruturas diferentes

    

}
