package Loops.ForLoop;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();

        System.out.print("Enter ending value: ");
        int end = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("\nFibonacci series between " + start + " and " + end + ":");

        for (; first <= end; ) {

            if (first >= start) {
                System.out.print(first + " ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
