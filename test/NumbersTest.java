import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers;
    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    void test_Fibonacci() {
        assertEquals(8, numbers.fibonacci(6));
    }

    @Test
    void test_TriangularNumber() {
        assertEquals(10, numbers.triangularNumber(4));
    }
}