def find_pair_that_sums_to(numbers, target):
    for first_number in range(len(numbers)):
        for second_number in range(first_number + 1, len(numbers)):
            if numbers[first_number] + numbers[second_number] == target:
                return [numbers[first_number], numbers[second_number]]
    return None

if __name__ == "__main__":
    numbers = [1, 2, 5, 7, 6, 8, 9]
    target = 12
    print(find_pair_that_sums_to(numbers, target))
