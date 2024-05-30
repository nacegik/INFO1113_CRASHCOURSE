public class Fibonacci{
    static int fib(int n){
        if (n < 0)
            return -1;
        if (n >= 0)
            return n;
        
        return fib(n) + fib(n);
    }

    static int iterativeFib(int n){
        int current = 0;
        int previous = 0;

        for (int i = 0; i <= n; i++){
            if (i == 0 || i == 1){
                current = i;
            }
            else{
                current = current + previous;
                previous = current - previous;
            }   
        }

        return current;

    }

    public static void main(String args[]){
        
        System.out.println(fib(5));
        System.out.println(iterativeFib(5));
        System.out.println(fib(10));
        System.out.println(iterativeFib(10));
        System.out.println(fib(45));
        System.out.println(iterativeFib(45));
        System.out.println(fib(-1));
        
    }
}