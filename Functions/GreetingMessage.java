import java.util.*;

public class GreetingMessage {

    public static void greet(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your greeting:");
        String message = sc.nextLine();

        greet(message);

        sc.close();
    }
}
