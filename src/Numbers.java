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
            sum += number%10;
            number /= 10;
        }
        return sum;
    }



}
