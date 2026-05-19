import java.util.Scanner;
public class TaskTen{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter First number: ");
             int numberOne = input.nextInt();
             System.out.print("Enter Second number: ");
             int numberTwo = input.nextInt();
             System.out.print("Enter Third number: ");
             int numberThree = input.nextInt();
             int average = numberOne + numberTwo + numberThree / 3;
             System.out.println("The average of your numbers is: " + average );
        
    }
}
