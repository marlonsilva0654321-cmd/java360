public class Algoritimo18Al {
    public static void main(String[] args) {
        int[] pares = new int[101];
        int indice = 0;

        for (int i = 0; i <= 200; i += 2) {
            pares[indice] = i;
            indice++;
        }
        for (int j = 0; j < pares.length; j++) {
            System.out.println(pares[j]);
        }
    }
}