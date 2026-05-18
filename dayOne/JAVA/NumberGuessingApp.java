import java.util.Scanner;
import Random;

public class NumberGuessingApp{
    public static void main(String [] args){
        Scanner inputCollector = new Scanner(System.in);
        Random rand = new Random();
        int correctNumber = rand.nextInt();
        
        for(count = 1; count <= 1; count++){
            System.out.print("Enter a number between 1 and 100, you have 5 attempts: "); 
        }
        int number = inputCollector.nextInt();
        
        if(number <= 100 && number > 0){
            if (number == correctNumber){
                break;
            }
        else{ 
            for (int count =1; count <= 5; count++){
                System.out.print("Enter your number: ")
                number = inputCollector.nextInt();
                if(number == correctNumber){
                    num++;
                    break;
                } 
            }
        }
    }
}

 


     if attempts == 1:
         return "Legendary"
     else if attempts == 2:
         return "Excellent"
     else if attempts in [3, 4]:
         return "Good"
     else if attempts == 5:
         return "Close!"
     else:
         return "Better luck next time"
    
    }
}


