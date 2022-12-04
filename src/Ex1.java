import java.util.Scanner;
/*Construa um programa que leia um número n e imprima
n linhas no formato de um triangulo retangulo:*/
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = input.nextInt();
        
        for (int i = 1; i < n + 1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}