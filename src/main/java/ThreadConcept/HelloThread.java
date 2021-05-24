package ThreadConcept;

public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("thread name:"+Thread.currentThread().getName());//return the running object
        System.out.println("hello");
    }
    public static void main(String[] args){
        Thread thread = new HelloThread();
        thread.start();
    }

}
