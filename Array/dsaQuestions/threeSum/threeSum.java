package Array.dsaQuestions.threeSum;

import Array.twoPointers.*;
import java.util.*;

public class threeSum {
    public static void main(String[] args) {

        Scanner ts = new Scanner(System.in);

        int[] array = EnterArray.inputArray();
        int[] sarray = SortArray.sortArray(array);

        System.out.print("Enter your Target: ");
        int target = ts.nextInt();

        for (int i = 0; i < sarray.length - 2; i++) {

            int left = i + 1;
            int right = sarray.length - 1;

            while (left < right) {

                int sum = sarray[i] + sarray[left] + sarray[right];

                if (sum == target) {

                    System.out.println("[ " + sarray[i] + " , " + sarray[left] + " , " + sarray[right] + " ]  | Sum is : "+sum);


                    // Move both pointers to continue searching
                    left++;
                    right--;

                } else if (sum < target) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        ts.close();
    }
}