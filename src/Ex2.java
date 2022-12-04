import java.util.Scanner;
/*Write a function that receives a vector with 10 values
and return how many of these values are negative*/
public class Ex2 {
    public static void main(String[] args)  throws Exception{
        Scanner input = new Scanner(System.in);
        int[] x = new int[10];
        int qtd = 0;

        System.out.println("Enter 10 numbers (positives and negatives):");

        for(int i = 0; i < 10; i++){
            System.out.println("Enter a number " + (i + 1) + ":");
            x[i] = input.nextInt();
            if (x[i] < 0){
                qtd++;
            }
        }

        System.out.println("The numbers entered were:");

        for (int i = 0; i < 10; i++){
            System.out.println(x[i]);
        }
        System.out.println("You entered " + qtd + " negative numbers!");
    }
}
