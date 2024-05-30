interface BinaryOperator{
    int apply(int x, int y);
}
public class BinaryOperators{
    public static void main(String[] args){
        // create lambdas for the following code to run
        
        BinaryOperator multiply = (int x, int y) -> { return x * y; };
        System.out.println(multiply.apply(2, 3)); //6

        BinaryOperator add = (int x, int y) -> { return x + y; };
        System.out.println(add.apply(2,3)); //5

        BinaryOperator power = (int x, int y) -> {
            int result = 1;
            for (int i = 0; i < y; i++)
                result *= x;
            return result;
        }
        System.out.println(power.apply(2,3)); //8
    }
}