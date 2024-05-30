public interface Speak extends Eat{
    public default void eat(){
        System.out.println("I eat solid food now");
    }
    public void speak();
}