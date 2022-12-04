import java.util.Scanner;
/*Escrever uma função que receba um vetor com 10 valores
e retorne quantos destes valores são negativos*/
public class Ex2 {
    public static void main(String[] args)  throws Exception{
        Scanner input = new Scanner(System.in);
        int[] x = new int[10];
        int qtd = 0;

        System.out.println("Digite 10 numeros (positivos e negativos):");

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o numero " + (i + 1) + ":");
            x[i] = input.nextInt();
            if (x[i] < 0){
                qtd++;
            }
        }

        System.out.println("Os numeros digitados foram:");

        for (int i = 0; i < 10; i++){
            System.out.println(x[i]);
        }
        System.out.println("Voce digitou " + qtd + " numeros negativos!");
    }
}
