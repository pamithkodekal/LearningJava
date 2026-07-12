package Array.twoPointers;

import java.util.Scanner;

public class EnterArray {

    public static int[] inputArray() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Sorted Array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
         System.out.println("Array is:");

        for (int num : array) {
            System.out.print(num + " ");
        }
        
        sc.close();
        return array;
    }
}