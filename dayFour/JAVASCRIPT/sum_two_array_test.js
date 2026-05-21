const{target}= require(./ sum_two_array)
    
    
    test("find_pair_that_sums_to_12"()=> {
        let numbers = {1, 2, 5, 7, 6, 8, 9};
        let target = 12;
        
        expect(sum(numbers[], target)).toBe(12)
    }
    // @Test
    // public void testFindPairThatSumsTo6() {
    //     int[] numbers = {8,6,12,4,-2};
    //     int target = 6;
    //     int[] expected = {8, -2};
    //     assertArrayEquals(expected, SumTwoArray.findPairThatSumsTo(numbers, target));
    // }
}

