package practicet;

public class Fibonacci {

    /**
     * Recursive function to compute the i'th Fibonacci number
     */
    private static int fib( int i ) {
            if (i < 2) return i;
            return fib(i - 1) + fib(i - 2);
    }

    /**
     * Main program
     */
    public static void main(String[] args) {
            int i = 0;
            while (true && i<40) { // compute successive Fibonacci numbers
                    System.out.print(fib(i)+" " );
                    i = i + 1;
                    if(i%5==0)
                    {
                    	System.out.println();
                    }
            }
    }
}