print("\nParking Slots:")
for i in range(20):
    print(f"Slot {i + 1}: {parking[i]}")

    print(f"\nFilled Spaces: {filled}")
    print(f"Available Spaces: {available}")


while True:
    print("\n===== PARKING LOT SYSTEM =====")
    print("1. Park a Car")
    print("2. Remove a Car")
    print("3. Display Parking Status")
    print("4. Exit")

    user_choice = int(input("Enter your choice: "))

# Park a car
    if choice == 1:
        parked = False

        for i in range(20):
            if parking[i] == 0:
                parking[i] = 1
                print(f"Car parked at slot {i + 1}")
                parked = True
                break

        if not parked:
            print("Parking lot is full!")

        display_status()

# Remove a car
    elif choice == 2:
        slot = int(input("Enter slot number to remove car (1-20): "))

        if 1 <= slot <= 20:
            if parking[slot - 1] == 1:
                parking[slot - 1] = 0
                print(f"Car removed from slot {slot}")
            else:
                print("Slot is already empty.")
        else:
            print("Invalid slot number.")

        display_status()

# Display status
    elif choice == 3:
        display_status()

# Exit
    elif choice == 4:
        print("Exiting program...")
        break

    else:
        print("Invalid choice.")
