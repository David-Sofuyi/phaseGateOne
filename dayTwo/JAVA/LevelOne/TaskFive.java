import java.util.Scanner;
public class TaskFive{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            System.out.print("Enter your temprature in celcius: ");
             double temperature = input.nextInt();
             double toFahrenheit = temperature * 1.8 + 32;
            
             System.out.println("Your temperature in Faherenheit is: " + toFahrenheit );
        
    }
}
