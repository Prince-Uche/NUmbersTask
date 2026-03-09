import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers;
    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

        @Test
        void testThat_numberIsPositive() {
            assertTrue(numbers.isPositive(5));
            assertFalse(numbers.isPositive(-3));
        }

        @Test
        void testIsNegative() {
            assertTrue(numbers.isNegative(-1));
            assertFalse(numbers.isNegative(10));
        }

        @Test
        void testThat_numberIsNatural() {
            assertTrue(numbers.isNatural(10));
            assertFalse(numbers.isNatural(-5));
        }

        @Test
        void testThat_numberIsWhole() {
            assertTrue(numbers.isWhole(7));
            assertFalse(numbers.isWhole(-2));
        }

        @Test
        void testThat_numberIsEvenAndOdd() {
            assertTrue(numbers.isEven(4));
            assertFalse(numbers.isEven(5));
            assertTrue(numbers.isOdd(5));
            assertFalse(numbers.isOdd(4));
        }

        @Test
        void testThat_numberIsDeficient() {
            assertTrue(numbers.isDeficient(10));
            assertFalse(numbers.isDeficient(6));
        }

        @Test
        void testThat_numberIsPerfectNumber() {
            assertTrue(Numbers.isPerfectNumber(6));
            assertFalse(Numbers.isPerfectNumber(10));
        }

        @Test
        void testThat_numberIsPrime() {
            assertTrue(numbers.isPrime(2));
            assertFalse(numbers.isPrime(4));
        }

        @Test
        void testThat_numberIsComposite() {
            assertTrue(numbers.isComposite(4));
            assertFalse(numbers.isComposite(2));
        }

        @Test
        void testThat_factorsAreAccurate() {
            assertEquals(List.of(1,2,5,10), numbers.getFactors(10));
        }

        @Test
        void testThat_sumOfDigitsIsAccurate() {
            assertEquals(6, numbers.sumOfDigits(123));
            assertEquals(0, numbers.sumOfDigits(0));
        }

        @Test
        void testThat_numberIsSpecial() {
            assertTrue(numbers.isSpecial(6));
            assertFalse(numbers.isSpecial(10));
        }

        @Test
        void testThat_numberIsPalindrome() {
            assertTrue(numbers.isPalindrome(121));
            assertFalse(numbers.isPalindrome(123));
        }


        @Test
        void testThat_youCanGetBinary() {
            assertEquals("0", Numbers.getBinary(0));
            assertEquals("1010", Numbers.getBinary(10));
        }

        @Test
        void testThat_youCanGetOctal() {
            assertEquals("0", Numbers.getOctal(0));
            assertEquals("12", Numbers.getOctal(10));
        }

        @Test
        void testThat_digitalSumIsAccurate() {
            assertEquals(6, Numbers.digitalSum(123));
            assertEquals(0, Numbers.digitalSum(0));
        }

        @Test
        void testThat_factorialIsAccurate() {
            assertEquals(120, Numbers.factorial(5));
            assertThrows(IllegalArgumentException.class, () -> Numbers.factorial(-3));
        }

        @Test
        void test_toGetFibonacciNumber() {
            assertEquals(8, numbers.fibonacci(6));
        }

        @Test
        void test_toGetTriangularNumber() {
            assertEquals(10, numbers.triangularNumber(4));
        }
    }