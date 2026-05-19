import java.util.Scanner;
public class TaskSeven{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius: ");
             double radius = input.nextInt();
             double pie = 3.142;
             double circumference = pie * radius * radius;
            
             System.out.println("The circumference of the circle is : " + circumference );
        
    }
}
