import java.util.Scanner;

public class TaskSeven {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = inputCollector.nextLine();

        if (password.equals("admin123"))
            System.out.println("Password matches");
        else
            System.out.println("Password does not match");
    }
}
