package Array.twoPointers;

public class SortArray {

    public static int[] sortArray(int[] array) {

        int[] tobeSorted = array;

        for (int i = 0; i < tobeSorted.length - 1; i++) {
            for (int j = i + 1; j < tobeSorted.length; j++) {

                if (tobeSorted[i] > tobeSorted[j]) {

                    int temp = tobeSorted[j];
                    tobeSorted[j] = tobeSorted[i];
                    tobeSorted[i] = temp;

                }
            }
        }

        return tobeSorted;
    }
}