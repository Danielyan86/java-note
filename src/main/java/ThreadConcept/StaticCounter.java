package ThreadConcept;

public class StaticCounter {
    private static int counter = 0;
    public static synchronized void incr( ){
        counter++;
    }
    public static synchronized int getCounter(){
        return counter;
    }
}
