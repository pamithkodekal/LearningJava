package BitManipulation;

import java.util.*;

public class GetBinary {

    // Show Binary
    public void getBinary(int n) {

        int arr[] = new int[32];

        int i = 0;

        int temp = n;

        while (temp > 0) {

            arr[i] = temp % 2;

            temp = temp / 2;

            i++;
        }

        System.out.print("Binary: ");

        for (int j = i - 1; j >= 0; j--) {

            System.out.print(arr[j]);
        }

        System.out.println();
    }

    // Check Bit
    public void getBit(int n, Scanner sc) {

        System.out.print("What position to check: ");

        int position = sc.nextInt();

        int bitMask = 1 << position;

        System.out.println("Bit Mask is: " + bitMask);

        int operation = bitMask & n;

        if (operation == 0) {

            System.out.println("Bit is 0");

        } else {

            System.out.println("Bit is 1");
        }
    }

    // Set Bit
    public int setBit(int n, Scanner sc) {

        System.out.print("What position to set: ");

        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        int updatedNumber = bitMask | n;

        return updatedNumber;
    }
}