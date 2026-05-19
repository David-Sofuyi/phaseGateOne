import java.util.Scanner;

public class TaskThree {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = inputCollector.nextInt();

        if (score >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
