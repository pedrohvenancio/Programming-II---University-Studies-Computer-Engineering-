import java.util.Scanner;

/* Faça uma função que recebe, por parâmetro, uma matriz A(5,5)
e retorna a soma dos seus elementos.*/

public class Ex3 {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int[][] x = new int[5][5];

        System.out.println("Olá, digite sua matriz:");
        leitura(x);
    }

    public static void leitura(int[][] x){ 
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Linha " + (i +1) + ":");
            for(int j = 0; j < 5; j++){
                System.out.println("Numero " + (j + 1));
                x[i][j] = input.nextInt();
            }
        }

        int soma, i, j;
        soma = 0;
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                soma = x[i][j] + soma;
            }
        }
        System.out.println("A soma de todos os numeros é: " + soma);
    }
}