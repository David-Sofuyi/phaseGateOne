import java.util.Scanner;
public class TaskFour{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter First number: ");
             int numberOne = input.nextInt();
             System.out.print("Enter Second number: ");
             int numberTwo = input.nextInt();
             int product = numberOne * numberTwo;
             System.out.println("The product of both your numbers is: " + product );
        
    }
}
