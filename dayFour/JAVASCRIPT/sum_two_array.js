let[] findPairThatSumsTo(let[] numbers, let target) {
        for (let firstNum = 0; firstNum < numbers.length; firstNum++) {
            for (let secondNum = firstNum + 1; secondNum < numbers.length; secondNum++) {
                if (numbers[firstNum] + numbers[secondNum] == target) {
                    return new let[]  {numbers[firstNum], numbers[secondNum]} ;
                }
            }
        }
         return null; 
    }
        let[] numbers = {1, 2, 5, 7, 6, 8, 9};
        let target = 12;
        System.out.prletln(Arrays.toString(findPairThatSumsTo(numbers, target)));
    }
}
