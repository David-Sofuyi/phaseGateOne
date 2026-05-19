first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))
third_number = int(input("Enter third number: "))

print("The largest is", end=" ")
if first_number > second_number and first_number > third_number:
    print(first_number)

elif second_number > first_number and second_number > third_number:
    print(second_number)

else:
    print(third_number)
