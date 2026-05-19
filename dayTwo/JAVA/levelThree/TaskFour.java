java.util.Scanner;
public class TaskFour{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumber = input.nextInt;
        for (int index = 1; index <= 12; index++) {
            System.out.println(index + userNumber + " = " + userNumber * index);
        }
            System.out.println()
