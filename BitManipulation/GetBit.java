package BitManipulation;

import java.util.*;

public class GetBit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        GetBinary obj = new GetBinary();

        System.out.print("Original ");
        obj.getBinary(n);

        obj.getBit(n, sc);

        n = obj.setBit(n, sc);

       
        System.out.println("Updated Number (Integer): " + n);

        
        System.out.print("Updated Number (Binary): ");
        obj.getBinary(n);

        System.out.println("Binary using inbuilt method: "
                + Integer.toBinaryString(n));

        sc.close();
    }
}