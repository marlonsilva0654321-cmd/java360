public class Algoritimo41 {
    public void main(){
        //Matrizes
        //Matriz Bidimensional(2D)
        //3 Linhas e 2 Colunas = 3x2
        //2x2 (Matriz quadrada) - mesma qtde de L,C
        int [][] m = {{21,25} , {33,35}};
        int soma = 0;
        for ( int i=0; i <m.length; i++){
            for (int j = 0; j<m[i].length;j++){
                soma += m[i][j];
            }
        }   
         IO.println(soma);

         }    
        }


