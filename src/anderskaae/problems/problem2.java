package anderskaae.problems;

/*
        Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        By starting with 1 and 2, the first 10 terms will be : 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class problem2 {

    public problem2() {
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacciEvenValuedSum() {
        int sum = 0;

        for (int i = 0; i < 100000; i++) {

            long current = fibonacci(i);

            if (current > 4000000) {
                return sum;
            }

            if (current % 2 == 0) {
                sum += current;
            }
        }
        return sum;
    }

}
