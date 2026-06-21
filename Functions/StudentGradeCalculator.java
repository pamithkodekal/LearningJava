import java.util.Scanner;

public class StudentGradeCalculator{

    public static char grade(double marks){
        char Grade;

        if (marks >= 90 ){
            Grade ='A';
        }
        else{
             if (marks >= 75){
                Grade = 'B';
             }
             else if (marks >= 65){
                Grade = 'C';
             }else if (marks >= 40){
                Grade = 'D';
             }
             else{
                Grade='F';
             }

        }

        return Grade;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks:");
        double marks = sc.nextDouble();
        System.out.print("Grade optained from "+ marks +"% is "+  grade(marks));

        sc.close();

    }
}