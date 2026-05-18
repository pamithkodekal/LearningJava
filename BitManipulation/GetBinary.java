package BitManipulation;

import java.util.*;

public class GetBinary {

    public int[] GettingBinary(int n) {

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {

            arr[i] = -1;
        }

        int i = 0;

        while (n > 0) {

            arr[i] = n % 2;

            n = n / 2;

            i++;
        }

        return arr;
    }

    public void getBit(int n) {

     Scanner bits = new Scanner(System.in);

        System.out.print("What position to check: ");

        int position = bits.nextInt();

        int bitMask = 1 << position;

        System.out.println("Bit Mask is: " + bitMask);

        int operation = bitMask & n;

        if (operation == 0) {

            System.out.println("Bit is 0");
        } else {

            System.out.println("Bit is 1");
        }
        
        bits.close();
    }
}