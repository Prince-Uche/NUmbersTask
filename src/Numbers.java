import java.util.ArrayList;

public class Numbers {
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

    public static boolean isPerfectNumber(int number){
        int factorSum = 0;
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                factorSum += count;
            }
        }
        return factorSum == number;
    }

    public boolean isPrime(int number){
        int count = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0 ){
                count++;
            }
        }
        return count == 2;
    }

    public boolean isComposite(int number){
        int count = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0 ){
                count++;
            }
        }
        return count > 2;
    }

    public ArrayList<Integer> getFactors(int number){
        ArrayList<Integer>factors = new ArrayList<>();
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }


    public int sumOfDigits(int number){
        int sum = 0;
        while (number % 10 != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public boolean isSpecial(int number){
        ArrayList<Integer>factors = new ArrayList<>();
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                factors.add(i);
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

    

}
