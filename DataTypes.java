import java.util.*;

public class DataTypes {
    public static void main(String args[]){
        //Printing
        System.out.println("Hello World");
        //Assining
        int a = 10;
        int b = 25;
       
        //Taking Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(a * b);
        System.out.println(name);

        //Performing Operation
        System.out.println("Enter Two Digits for Add, Diff, Multi, Divide : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println (c+d);
        System.out.println (c-d);
        System.out.println (c*d);
        System.out.println (c/d);

        sc.close();
    }
}
