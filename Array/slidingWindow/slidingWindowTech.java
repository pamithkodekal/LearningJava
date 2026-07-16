package Array.slidingWindow;

public class slidingWindowTech {
    public static int swt(int[] arr,int k ){
        int [] swtarray = arr;
        int max_sum = 0;

        for (int i = 0 ; i < k ; i++)
            max_sum += arr[i];
        
        int window_sum = max_sum;
        for (int i = k ; i < swtarray.length ; i++){
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum,window_sum);

        }



        return max_sum;
    }
}
