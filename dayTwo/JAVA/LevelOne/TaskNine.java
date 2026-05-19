import java.util.Scanner;
public class TaskNine{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            System.out.print("Enter your price: ");
             double price = input.nextInt();
             
             double tax = price * 0.10;
             double totalPrice = price + tax;
             System.out.println("your total amount with 10% tax inclusive is: " + totalPrice );
        
    }
}
