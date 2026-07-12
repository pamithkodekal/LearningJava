package Array.twoPointers;

public class SquareOfArray {

    public static void main(String[] args) {

        int[] array = EnterArray.inputArray();
         
        int sqr [ ]= new int [array.length];
        for(int i = 0 ; i<array.length;i++){
            sqr[i] = array[i]*array[i];
        }
       
        sqr = SortArray.sortArray(sqr);
        System.out.println("Square of Array is : ");
        for(int i = 0 ; i<array.length;i++){
        
            System.out.print(sqr[i] + " ");
        }
    }
}