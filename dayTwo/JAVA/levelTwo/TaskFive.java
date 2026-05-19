import java.util.Scanner;

public class TaskFive {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = inputCollector.nextInt();

        System.out.print("The largest number is ");
        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            System.out.println(firstNumber);

        else if (secondNumber > firstNumber && secondNumber > thirdNumber)
            System.out.println(secondNumber);

        else
            System.out.println(thirdNumber);
    }
}
