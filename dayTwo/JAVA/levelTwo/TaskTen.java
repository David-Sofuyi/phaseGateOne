import java.util.Scanner;

public class TaskTen {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("It is divisible by both 5 and 3");
        else
            System.out.println("It is not divisible by both 5 and 3");
    }
}
