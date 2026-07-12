package Array.twoPointers;

import java.util.*;

public class FindTarget {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Sorted Array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Entered Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nEnter Target: ");
        int target = sc.nextInt();

        int left = 0;
        int right = array.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                System.out.println("\nPair Found!");
                System.out.println("Values : " + array[left] + " " + array[right]);
                System.out.println("Indices: " + left + " " + right);
                found = true;
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("\nNo Pair Found!");
        }

        sc.close();
    }
}