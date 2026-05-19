import java.util.Scanner;
public class TaskSix {

    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();       
        int sum1 = 0;

        for (int index = 1; index <= number; index++) {
            sum1 += index;
        }
        System.out.println("Sum = " + sum1);
    }
}
