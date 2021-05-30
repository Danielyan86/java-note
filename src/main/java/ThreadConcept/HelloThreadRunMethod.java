package ThreadConcept;

public class HelloThreadRunMethod extends Thread {
    @Override
    public void run() {
        System.out.println("thread name:" + Thread.currentThread().getName());//return the running object
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Thread thread = new HelloThreadRunMethod();
        thread.run();//run method will be called in main thread
    }

}
