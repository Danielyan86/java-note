package ThreadConcept;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Thread helloTread=new Thread((java.lang.Runnable) new HelloRunnable());
    }
}
