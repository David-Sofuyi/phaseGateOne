public class LevelFour{

    public static void addTwoNumber(int number1, int number2){
        int add = number1 + number2;
        return add;
    }
    
    public static void evenChecker(int number){
        if(number % 2 == 0);
        return true;
      
    }
    
    public static void numberSquareChecker(int number){
        square = number * number;
            return square;
    }
    
    public static void temperatureConverter(int number){
        int fahrenheit = number * 1.8 + 32;
            return fahrenheit;
        
    }
    
    public static void primeChecker(int number){
        for (int count = 2; count <= number.count; count++);
        return true;
    }
    
     public static void largestNumberChecker(int number1, int number2, int number3){
        if (number2 > number1 && number1 > number3);
            return;
    }
    
     public static void simpleInterestCalculator(double principal, double rate, double time){   
        int interest = 0;
        interest = (principal * rate * time / 100);
                return interest;
    }
    
     public static void areaOfRectangle(double width, double lenght){
        int area = 0;
            area = width * lenght;
        return area;
    }
    
     public static void reverseNumberChecker(int number){
     int reverse = 0;
     while (number !=0){
         digit = number %10;
         reverse = number *10+ digit;
         number= number /10;
         }
         return reverse;
    }
}
// public static void main (String [] args){
// System.out.println(addTwoNumber(11, 22));
// System.out.ptintln(evenChecker(20));
// System.out.ptintln(numberSquareChecker(11));
// System.out.ptintln(temperatureConverter(38));
// System.out.ptintln(primeChecker(101));
// System.out.ptintln(largestNumberChecker(14,13,11));
// System.out.ptintln(simpleInterestCalculator(5000, 10, 2));
// System.out.ptintln(areaOfRectangle(14, 7));
// System.out.ptintln(reverseNumberChecker(1234));
// }
// }
