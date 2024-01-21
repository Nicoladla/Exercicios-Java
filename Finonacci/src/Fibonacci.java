import java.util.Arrays;

public class Fibonacci {
    private int x;
    private long sum = 0;
    private long[] fibonacci;

    public Fibonacci() {
    }

    public Fibonacci(int x) {
        this.x = x;
        this.fibonacci= new long[x];
    }

    public void createFibonacci() {
        if(x <= 0) return;
        
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                fibonacci[i] = sum;
                sum = 1;
            } else if(i == 1){
                fibonacci[i] = sum;
            } else {
                sum = sum + fibonacci[i - 2];
                fibonacci[i] = sum;
            }

        }
    }

    public void getFibonacci() {
        for (int i = 0; i < fibonacci.length; i++) {
            long num= fibonacci[i];

            System.out.println(num);
        }

        System.out.println(Arrays.toString(fibonacci));
    }
}