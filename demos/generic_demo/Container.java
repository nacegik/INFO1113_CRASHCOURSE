public class Container<T> {

    private T element;

    //constructor method

    //set method

    //get method

    public static void main(String[] args){

        Container<String> stringContatiner = new Container<String>("Java");
        System.out.println(stringContatiner.get());

        stringContatiner.set("Crash Course");
        System.out.println(stringContatiner.get());

        Container<Integer> intContainer = new Container<Integer>(20);
        System.out.println(intContatiner.get());

        intContainer.set(23);
        System.out.println(intContainer.get());

    }
}