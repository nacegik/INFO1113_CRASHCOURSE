public class Newborn extends Child implements Eat{
    public Newborn(String name){
        super(name);
    }

    public void eat(){
        System.out.println("I can't eat solid food yet");
    }
}