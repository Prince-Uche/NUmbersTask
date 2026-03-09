import java.util.ArrayList;

public class Numbers {
    public boolean isPositive(int number){ return number > 0;}

    public boolean isNegative(int number){ return number < 0; }

    public boolean isNatural(int number) {
        return number >= 1;
    }

    public boolean isWhole(int number) {
        return number >= 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }


    public boolean isDeficient(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }
        return sum < number;
    }

    public boolean isAbundant(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }
        return sum > number;
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                sum += count;
            }
        }
        return sum == number;
    }

    public boolean isPrime(int number){
        int counter = 0;
        for(int count = 1; count <= number; count++){
            if(number % count == 0 ){
                counter++;
            }
        }
        return counter == 2;
    }

    public boolean isComposite(int number){
        int counter = 0;
        for(int count = 1; count <= number; count++){
            if(number % count == 0 ){
                counter++;
            }
        }
        return counter > 2;
    }

    public ArrayList<Integer> getFactors(int number){
        ArrayList<Integer>factors = new ArrayList<>();
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                factors.add(count);
            }
        }
        return factors;
    }


    public int sumOfDigits(int number){
        int sum = 0;
        while (number % 10 > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public boolean isSpecial(int number){
        ArrayList<Integer>factors = new ArrayList<>();
        int sum = 0;
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                factors.add(count);
            }
        }
        for(int digits:factors){
           sum += digits;
        }
        return sum == number;

    }

    public boolean isPalindrome(int number){
        String numberString = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberString).reverse().toString();
        return numberString.equals(reverseNumber);
    }


    public int fibonacci(int number){
        int fibonacci = 0;
        int fibonacci1 = 0;
        int fibonacci2 = 1;

        if(number < 0){
            throw new IllegalArgumentException("number is negative");
        }
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        else{
            for(int count = 1; count < number; count++){
                fibonacci = fibonacci1 + fibonacci2;
                fibonacci1 = fibonacci2;
                fibonacci2 = fibonacci;
            }
            return fibonacci;
        }
    }


    public int triangularNumber(int number){
        int triangularNumber = 0;
        int tNumber = 1;

        if(number < 0){
            throw new IllegalArgumentException("number is negative");
        }
        if(number == 0){
            return 0;
        }

        else{
            for(int count = 1; count <= number; count++){
                triangularNumber = tNumber*(tNumber + 1) / 2;
                tNumber = tNumber + 1;
            }
            return triangularNumber;
        }
    }

    public static String getBinary(int number) {
        int remainder;
        if (number == 0) return "0";
        String result = "";
        while (number > 0) {
            remainder = number % 2;
            result = remainder + result;
            number /= 2;
        }
        return result;
    }

    public static String getOctal(int number) {
        int remainder;
        if (number == 0) return "0";
        String result = "";
        while (number > 0) {
            remainder = number % 8;
            result = remainder + result;
            number /= 8;
        }
        return result;
    }

    public static int digitalSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        long result = 1;
        for (int count = 1; count <= number; count++) {
            result *= count;
        }
        return result;
    }
}
