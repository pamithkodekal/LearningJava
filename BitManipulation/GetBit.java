package BitManipulation;

import java.util.*;

public class GetBit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        GetBinary binaryObj = new GetBinary();

        binaryObj.getBit(n);

        sc.close();
    }
}