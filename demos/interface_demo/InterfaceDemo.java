public class InterfaceDemo{
    public static void main(String[] args){
        Square mySquare = new Square(4);
        mySquare.greeting();
        System.out.println(mySquare.area());

        Circle myCircle = new Circle(2);
        myCircle.greeting();
        System.out.println(myCircle.area());

        // inkblot lambda demo
    }
}