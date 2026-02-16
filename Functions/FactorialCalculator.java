import java.util.Scanner;

public class FactorialCalculator{

    public static int Factorial(int Facto){
        int result = 1;
        for(int i = Facto ; i >= 1; i--){
            result = result * i;
        }

        return result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Facto = sc.nextInt();
        System.out.println(Factorial(Facto));
        sc.close();
    }
}