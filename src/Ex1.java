import java.util.Scanner;
/*Build a program that reads a number n and prints
n lines in the shape of a rectangular triangle:*/
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();
        
        for (int i = 1; i < n + 1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}