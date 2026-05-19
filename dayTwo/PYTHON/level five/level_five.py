def is_prime(number):
    end = (number // 2) + 1

    for index in range(2, end):
        if (number % index == 0):
            return False

    return True

def get_sorted_prime(numbers):
    new_numbers = []

    for number in numbers:
        if is_prime(number):
            new_numbers.append(number)

    return new_numbers

def replace_negative_with_zero(numbers):
    for index in range(len(numbers)):
        if (numbers[index] < 0):
            numbers[index] = 0

