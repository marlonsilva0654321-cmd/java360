public class Algoritimo40 {
    public void main() {

        // Vetor - Matriz Unidimensional
        // Acadêmico - programação simples básico

        /*
        tabela - matriz bidimensional
        3D - matriz tridimensional
        */

        // Cinema, Séries, Desenhos, Animações, Games (The Legend of Zelda)
        // AutoCAD, Revit, SketchUP
        // Humanoide - Softwares 3D Simulação
        // Minecraft X, Y e Z

        // Vetor ou matriz unidimensional
        //             0  1  2   3  4
        int[] notas = {7, 9, 5, 10, 6};

        int maior = notas[0];

        IO.println(maior);

        // Muito útil para Big Data
        // E se fosse uma lista de 3 milhões de números?

        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > maior) {
                maior = notas[i];
            }

        }

        IO.println("A Maior Nota - " + maior);
    }
}