// write a function that takes in {1,2,5,7,6,8,9},12
// output = {5, 7}
// numbers that is in the array that sums up to the int outside the array


import java.util.*;
public class SumTwoArray {
    public static int[] findPairThatSumsTo(int[] numbers, int target) {
        for (int firstNum = 0; firstNum < numbers.length; firstNum++) {
            for (int secondNum = firstNum + 1; secondNum < numbers.length; secondNum++) {
                if (numbers[firstNum] + numbers[secondNum] == target) {
                    return new int[]  {numbers[firstNum], numbers[secondNum]} ;
                }
            }
        }
         return null; 
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 6, 8, 9};
        int target = 12;
        System.out.println(Arrays.toString(findPairThatSumsTo(numbers, target)));
    }
}
