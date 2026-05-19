import java.util.Arrays;
import java.util.ArrayList;

public class LevelFive {

    public static void main(String... args) {
        int[] numbersOne = {5, 9, 3, 6, 2};
        int[] newNumbersOne = sortArrayOfPrimeNumbers(numbersOne);
        System.out.println("Before: " + Arrays.toString(numbersOne));
        System.out.println("After: " + Arrays.toString(newNumbersOne));

        System.out.println();
        int[] numbersTwo = {5, -9, 3, -6, 2, -11};
        System.out.println("Before: " + Arrays.toString(numbersTwo));
        replaceNegativeWithZero(numbersTwo);
        System.out.println("After: " + Arrays.toString(numbersTwo));

        System.out.println();
        int[] numbersThree = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
        System.out.println("Before: " + Arrays.toString(numbersThree));
        int[] duplicateArrays = getDuplicateNumbersInArray(numbersThree);
        System.out.println("After: " + Arrays.toString(duplicateArrays));
    }

    public static int[] sortArrayOfPrimeNumbers(int[] numbers) {
        int count = 0;

        for(int number : numbers) {
            if (isPrime(number))
                count++;
        }

        int[] newArray = new int[count];
        int index = 0;

        for(int number : numbers) {
            if (isPrime(number))
                newArray[index++] = number;
        }

        return newArray;
    }

