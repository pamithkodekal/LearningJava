package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class StudentsFile {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println(
                    "Enter your Choice: \n" +
                            "1.Enter Student.\n" +
                            "2.Show Students List.\n" +
                            "3.Search Student.\n" +
                            "4.Update Student.\n" +
                            "5.Delete Student");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    BufferedWriter writer =
                            new BufferedWriter(new FileWriter("StudentsFileDB.txt", true));

                    System.out.print("Enter Student Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Student Enrollment No: ");
                    String enrollmentNo = sc.nextLine();

                    System.out.print("Enter Student Admission Date (DD/MM/YYYY): ");
                    String admissionDate = sc.nextLine();

                    writer.write(name + " | " + enrollmentNo + " | " + admissionDate);
                    writer.newLine();

                    writer.close();

                    System.out.println("Student Entered Successfully");
                    break;

                case 2:

                    System.out.println("===== List of Students =====");

                    BufferedReader reader =
                            new BufferedReader(new FileReader("StudentsFileDB.txt"));

                    String info;

                    while ((info = reader.readLine()) != null) {
                        System.out.println(info);
                    }

                    reader.close();
                    break;

                case 3:

                    System.out.println(
                            "Search Student by\n" +
                                    "1.Student Name.\n" +
                                    "2.Admission Date.\n" +
                                    "3.Enrollment No.");

                    int option = sc.nextInt();

                    System.out.println("You Selected " + option + " For Searching");

                    switch (option) {

                        case 1:

                            System.out.print("Enter Student Name for Searching: ");
                            sc.nextLine();
                            String Sname = sc.nextLine();

                            BufferedReader search =
                                    new BufferedReader(new FileReader("StudentsFileDB.txt"));

                            String txt;
                            String[] names;
                            boolean present = false;

                            while ((txt = search.readLine()) != null) {

                                names = txt.split("\\|");

                                if (names[0].trim().equalsIgnoreCase(Sname)) {

                                    System.out.println("Student Found. Details are:");

                                    System.out.println(
                                            names[0].trim() + " | " +
                                                    names[1].trim() + " | " +
                                                    names[2].trim());

                                    present = true;
                                    break;
                                }
                            }

                            search.close();

                            if (!present) {
                                System.out.println("Student Not Found");
                            }

                            break;

                        case 2:

                            System.out.print("Enter Student Admission Date: ");
                            sc.nextLine();
                            String DOA = sc.nextLine();

                            BufferedReader dateReader =
                                    new BufferedReader(new FileReader("StudentsFileDB.txt"));

                            String dateRecord;
                            String[] dates;
                            boolean datePresent = false;

                            while ((dateRecord = dateReader.readLine()) != null) {

                                dates = dateRecord.split("\\|");

                                if (dates[2].trim().equalsIgnoreCase(DOA)) {

                                    if (!datePresent) {
                                        System.out.println("Students with this Joining Date:");
                                        datePresent = true;
                                    }

                                    System.out.println(
                                            dates[0].trim() + " | " +
                                                    dates[1].trim() + " | " +
                                                    dates[2].trim());
                                }
                            }

                            dateReader.close();

                            if (!datePresent) {
                                System.out.println("Student Not Found with this Joining Date");
                            }

                            break;

                        case 3:

                            System.out.print("Enter Enrollment Number: ");
                            sc.nextLine();
                            String searchEn = sc.nextLine();

                            BufferedReader enReader =
                                    new BufferedReader(new FileReader("StudentsFileDB.txt"));

                            String record;
                            String[] en;
                            boolean enPresent = false;

                            while ((record = enReader.readLine()) != null) {

                                en = record.split("\\|");

                                if (en[1].trim().equalsIgnoreCase(searchEn)) {

                                    System.out.println("Student Found. Details are:");

                                    System.out.println(
                                            en[0].trim() + " | " +
                                                    en[1].trim() + " | " +
                                                    en[2].trim());

                                    enPresent = true;
                                    break;
                                }
                            }

                            enReader.close();

                            if (!enPresent) {
                                System.out.println("Student Not Found with this Enrollment Number");
                            }

                            break;

                        default:
                            System.out.println("Invalid Search Option");
                    }

                    break;

                case 4:
                    System.out.println("Inprogress...");
                    break;

                case 5:
                    System.out.println("Inprogress...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}