public interface Shape {
    public double area();
    public default void greeting(){
        System.out.println("I am a shape!");
    }
}