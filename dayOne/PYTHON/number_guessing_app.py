
def get_rating(attempts):
    """Return rating based on attempts used"""
    if attempts == 1:
        return "Legendary"
    elif attempts == 2:
        return "Excellent"
    elif attempts in [3, 4]:
        return "Good"
    elif attempts == 5:
        return "Close!"
    else:
        return "Better luck next time"

def main():
    print("Think of a number between 1 and 100, you have 5 attempts to guess it!")
    secret_number = random.randint(1, 100)
    max_attempts = 5
    attempts_used = 0
    won = False

   
    while attempts_used < max_attempts and not won:
        attempts_left = max_attempts - attempts_used
        user_input = input(f"Attempt {attempts_used + 1}/{max_attempts}. Enter your guess: ")

        
        try:
            guess = int(user_input)
        except ValueError:
            print("Error: That's not a number. Try again.\n")
            continue 

        if guess < 1 or guess > 100:
            print("Warning: Number must be between 1 and 100. Try again.\n")
            continue  

        attempts_used += 1

       
        if guess == secret_number:
            won = True
            print(f"\nCorrect! The number was {secret_number}.")
        elif guess < secret_number:
            print("Too low. Try higher.\n")
        else:
            print("Too high. Try lower.\n")
  
    rating = get_rating(attempts_used if won else 0)
    
    print(" Game Over")
    print(f"Correct number: {secret_number}")
    print(f"Attempts used: {attempts_used}/{max_attempts}")
    print(f"Rating: {rating}")

if __name__ == "__main__":
    main()

