import java.util.Scanner;

/*Make a function that takes, by parameter, an array A(5,5)
and returns the sum of its elements*/

public class Ex3 {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int[][] x = new int[5][5];

        System.out.println("Hello, enter your array:");
        readerr(x);
    }

    public static void readerr(int[][] x){ 
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Line " + (i +1) + ":");
            for(int j = 0; j < 5; j++){
                System.out.println("Number " + (j + 1));
                x[i][j] = input.nextInt();
            }
        }

        int sum, i, j;
        sum = 0;
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                sum = x[i][j] + sum;
            }
        }
        System.out.println("The sum  of these numbers is: " + sum);
    }
}