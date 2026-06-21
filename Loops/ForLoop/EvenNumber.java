package Loops.ForLoop;
import java.util.*;

public class EvenNumber {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int even;
   
    System.out.println("Enter Strting Digit and The Number of even numbers you want");
         int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i < end ; i++ ){
             even = i*2 ;
             System.out.println(even);
        }
    }
}
