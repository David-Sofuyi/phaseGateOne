import java.util.Scanner;

public class MiniParkingLot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] parking = new int[20];
        int user_choice;
        
            System.out.println("\n===== WELCOME TO SEMICOLON MINI PARKING LOT  =====");
            System.out.println(" CHOOSE FROM THE OPTIONS BELOW");
            System.out.println("1. Park a Car");
            System.out.println("2. Remove a Car");
            System.out.println("3. Display Parking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            user_choice = input.nextInt();
            
    switch (user_choice) {
            // park cars
            case 1:
            boolean parked = false;
            for (int i = 0; i < parking.length; i++) {
                if (parking[i] == 0) {
                    parking[i] = 1;
            System.out.println("Car parked at slot " + (i + 1));
                parked = true;
                break;
            }
            }
                if (!parked) {
            System.out.println("Parking lot is full!");
            }
            displayStatus(parking);
                break;
            
            
   // Remove a car
            case 2:
            System.out.print("Enter slot number to remove car (1-20): ");
                int slot = input.nextInt();
                    if (slot >= 1 && slot <= 20) {
                        if (parking[slot - 1] == 1) {
                            parking[slot - 1] = 0;
            System.out.println("Car removed from slot " + slot);
            } else {
            System.out.println("Slot is already empty.");
            }
            } else {
            System.out.println("Invalid slot number.");
            }

            displayStatus(parking);
                    break;

            // Display parking status
            case 3:
            displayStatus(parking);
                    break;
            default:
                    System.out.println("Invalid choice.");
            }

            //        break;
    }
    


public static void displayStatus(int[] parking) {
        int filled = 0;
        int available = 0;

        System.out.println("\nParking Slots:");

        for (int i = 0; i < parking.length; i++) {
            System.out.println("Slot " + (i + 1) + ": " + parking[i]);

            if (parking[i] == 1) {
                filled++;
            } else {
            available++;
            }
        }
        System.out.println("\nFilled Spaces: " + filled);
        System.out.println("Available Spaces: " + available);
    }
     }
