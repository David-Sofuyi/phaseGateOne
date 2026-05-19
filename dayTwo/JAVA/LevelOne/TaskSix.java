import java.util.Scanner;
public class TaskSix{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the length: ");
             double lenght = input.nextInt();
             
             System.out.print("Enter the width: ");
             double width = input.nextInt();
             double area = lenght * width;
            
            
             System.out.println("The area of your rectangle  is : " + area );
        
    }
}
