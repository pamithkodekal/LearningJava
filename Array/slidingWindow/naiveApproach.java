package Array.slidingWindow;

//import java.util.*;

public class naiveApproach {

    public static int Maxsum(int[] arr,int k) {

    
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {

            int current_sum = 0;

            for (int j = 0; j < k; j++) {
                current_sum += arr[i + j];
            }

            max_sum = Math.max(current_sum, max_sum);
        }
        //na.close();

        return max_sum;
    }
}