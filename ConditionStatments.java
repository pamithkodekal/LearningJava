import java.util.*;

public class ConditionStatments {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "Welcome to Course Registration\n" +
            "CGPA > 7.5 -->  Can Register\n" +
            "CGPA > 8.5 --> Course is FREE\n"
        );

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int num = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        boolean c;

        if (cgpa >= 8.5) {
            System.out.println("Congrats " + name +" Rollno  " + num +
                "! You are eligible for FREE course registration.");

                 c = true;
        } 
        else if (cgpa >= 7.5) {
            System.out.println("Congrats " + name +" Rollno  "+ num +
                "! You are eligible for course registration.");
                 c = true;
        } 
        else {
            System.out.println("Sorry " + name + ", you are NOT eligible.");
             c = false;
        }

        if (c==true){

            System.out.println("Select Course\n1.DIP\n2.IOT\n3.JAVA");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Congarts " + name + " You are Successfully Enrolled For DIP ");
                    break;
                case 2:
                    System.out.println("Congarts " + name + " You are Successfully Enrolled For IOT ");
                    break;
                case 3:
                    System.out.println("Congarts " + name + " You are Successfully Enrolled For JAva ");
                    break;
            
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } else{
            System.out.println("Study more");
        }
        
        sc.close(); // removes VS Code warning
    }
}
