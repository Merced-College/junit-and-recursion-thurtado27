public class RecursiveProblems {

    // Problem 1: Factorial 
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Problem 2: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 3: Sum of array
    public static int sumArray(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    // Problem 4: Reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Problem 5: Count occurrences of a character
    public static int countChar(String str, char c) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == c) ? 1 : 0;
        return count + countChar(str.substring(1), c);
    }


}