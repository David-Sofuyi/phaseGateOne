    import java.util.Scanner;
    
    import java.util.Random;
    
    public class NumberGuesser {

    public static void main (String [] args){

    Scanner inputCollector = new Scanner (System.in);
    
    Random randomNumber = new Random ();
    
    int number = randomNumber.nextInt(100) + 1;
          
   int num = 0;
   
   for (int count = 1; count <= 5;count++) {
    System.out.print("Enter A Number from 1 to 100: ");
    int userInput = inputCollector.nextInt();
    
   if (userInput == number) {
       num += count;
       if (count == 1) {
  System.out.println("The Correct Number is " + userInput + " With "+ count + "attempts used" + "and a Legendary rating");       
       }
     else if (count == 2) {
 System.out.println("The Correct Number is " + userInput + " With "+ count + "attempts used" + "and a Excellent rating");  
     }
        else if (count == 3 || count == 4) {
 System.out.println("The Correct Number is " + userInput + " With "+ count + "attempts used" + "and a Good rating");  
        }
       else if (count == 5) {
 System.out.println("The Correct Number is " + userInput + " With "+ count + "attempts used" + "and a Close rating");  
       }
       
       break;
        }
        
   else if (userInput != number){
   if (userInput < number) {
   System.out.println("Lower than number");
   }
   else if (userInput > number) {
   System.out.println("Higher than number");
   } 
     
   }
   } 
    System.out.println();   
    System.out.println("Ohh! wrong");
    System.out.println("Better Luck Next Time");
   
   }
}

