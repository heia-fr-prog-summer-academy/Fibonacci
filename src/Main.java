public class Main {

    public static void main(String[] args) {
	    int fib = 0;
	    int nextFib = 1;
	    while (fib < 100) {
	        System.out.println(fib);
	        int temp = fib;
	        fib = nextFib;
	        nextFib += temp;
	    }
    }
}
