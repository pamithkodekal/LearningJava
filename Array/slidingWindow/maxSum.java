package Array.slidingWindow;

import Array.twoPointers.*;
import java.util.*;

public class maxSum {
    public static void main(String[] args) {

        int[] myArray = EnterArray.inputArray();
        Scanner na = new Scanner(System.in);

        System.out.println("\nEnter size of subarray (k): ");
        int k = na.nextInt();
      
        
        System.out.print("Select your Choice: \n1.NaiveApproch (O(n×k)).\n2.Sliding window Approch (O(n))");
        int choice = na.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Excuting NaiveApproch");
                int max = naiveApproach.Maxsum(myArray, k);
                System.out.println(max);
                break;
            
            case 2:
                 System.out.println("Excuting Sliding Windows");
                 int max2 = slidingWindowTech.swt(myArray, k);
                 System.out.print(max2);
                break;
        
            default:
                System.out.println("Enter Valid Input");
                break;
        }
    
        

        
    
        na.close();
    }
}