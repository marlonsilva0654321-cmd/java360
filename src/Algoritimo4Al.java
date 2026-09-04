public class Algoritimo4Al {
    public static void main(String[] args) {
        int diasDaSemana = 3;
        String nomeDoDia;
    
        switch (diasDaSemana) {
            case 1:
                nomeDoDia = "Segunda-feira";
                break;
            case 2:
                nomeDoDia = "Terça-feira";
                break;
            case 3:
                nomeDoDia = "Quarta-feira";
                break;
            default:
                nomeDoDia = "Dia inváldio";


        }

        IO.println(nomeDoDia); //Quarta-feira

    }
}
