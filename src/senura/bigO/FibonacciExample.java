package senura.bigO;

public class FibonacciExample {

        // Recursive Fibonacci function
        public static int fib(int n) {
            if (n <= 1) {
                return n;  // Base case: fib(0)=0, fib(1)=1
            }
            return fib(n - 1) + fib(n - 2);  // Recursive case
        }

}
