import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveProblemsTest {

    @Test
    void testFactorial() {
        assertEquals(1, RecursiveProblems.factorial(0));
        assertEquals(1, RecursiveProblems.factorial(1));
        assertEquals(2, RecursiveProblems.factorial(2));
        assertEquals(6, RecursiveProblems.factorial(3));
        assertEquals(24, RecursiveProblems.factorial(4));
    }

    @Test
    void testFibonacci() {
        assertEquals(0, RecursiveProblems.fibonacci(0));
        assertEquals(1, RecursiveProblems.fibonacci(1));
        assertEquals(1, RecursiveProblems.fibonacci(2));
        assertEquals(2, RecursiveProblems.fibonacci(3));
        assertEquals(3, RecursiveProblems.fibonacci(4));
    }

    @Test
    void testSumArray() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(0, RecursiveProblems.sumArray(arr1, 0));
        assertEquals(15, RecursiveProblems.sumArray(arr2, 0));
        assertEquals(14, RecursiveProblems.sumArray(arr2, 1));
        assertEquals(5, RecursiveProblems.sumArray(arr2, 4));
        assertEquals(0, RecursiveProblems.sumArray(arr2, 5));
    }

    @Test
    void testReverseString() {
        assertEquals("", RecursiveProblems.reverseString(""));
        assertEquals("a", RecursiveProblems.reverseString("a"));
        assertEquals("cba", RecursiveProblems.reverseString("abc"));
        assertEquals("54321", RecursiveProblems.reverseString("12345"));
        assertEquals("olleh", RecursiveProblems.reverseString("hello"));
    }

    @Test
    void testCountChar() {
        assertEquals(0, RecursiveProblems.countChar("", 'a'));
        assertEquals(3, RecursiveProblems.countChar("banana", 'a'));
        assertEquals(2, RecursiveProblems.countChar("apple", 'p'));
        assertEquals(1, RecursiveProblems.countChar("orange", 'g'));
        assertEquals(0, RecursiveProblems.countChar("orange", 'z'));
    }
}