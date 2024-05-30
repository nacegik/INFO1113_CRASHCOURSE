public class Infant extends Child implements Speak{
    public Infant(String name){
        super(name);
    }

    public void speak(){
        System.out.println("I can say bu bu bu");
    }
}