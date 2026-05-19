import java.util.Scanner;

public class TaskNine {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = inputCollector.nextInt();


        if (age <= 12)
            System.out.println("Child");
        else if (age < 18)
            System.out.println("Teen");
        else
            System.out.println("Adult");

    }
}
