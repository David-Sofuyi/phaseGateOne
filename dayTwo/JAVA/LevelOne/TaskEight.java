import java.util.Scanner;
public class TaskEight{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            System.out.print("Enter your number: ");
             int number = input.nextInt();
             
             int squareNumber = number * number;
            
             System.out.println("The square of your number is: " + squareNumber );
        
    }
}
