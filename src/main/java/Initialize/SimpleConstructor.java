package Initialize;

class Rock {
    Rock() {
        System.out.println("this is the simple constructor");//it is like python __init__ constructor method
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
            new Rock();
    }
}
