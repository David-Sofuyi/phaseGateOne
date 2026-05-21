import java.util.ArrayList;

public class Duplicate {

    public static int[] getDuplicates(int[] numbers) {

        int [] uniqueNumbers = new ArrayList<>();

        for (int eachNumber = 0; eachNumber < numbers.length; eachNumber++) {

            if (!uniqueNumbers.contains(numbers[eachNumber])) {
                uniqueNumbers.add(numbers[eachNumber]);
            }
        }

        int[] result = new int[uniqueNumbers.size()];

        for (int eachNumber = 0; eachNumber < uniqueNumbers.size(); eachNumber++) {
            result[eachNumber] = uniqueNumbers.get(eachNumber);
        }

        return result;
    }


    public static void main(String[] args) {


        int[] numbers = {9,5,1,9,4,5,1,7};

        int[] result = getDuplicates(numbers);

        System.out.println(result);
        }
