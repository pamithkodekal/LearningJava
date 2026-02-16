import java.util.*;

public class NumberCategoryChecker {

    public static void numberChecker(double num) {

        // Positive, Negative, or Zero
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        // Even or Odd (only for whole numbers)
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        numberChecker(num);

        sc.close();
    }
}
