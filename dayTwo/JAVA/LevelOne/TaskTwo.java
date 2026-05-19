import java.util.Scanner;
public class TaskTwo{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter your age: ");
             int age = input.nextInt();
             int FutureAge = age + 5;
             System.out.println("you will be " + FutureAge +  " in the next 5 years" );
        
    }
}
