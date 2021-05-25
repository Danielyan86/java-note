//竞态条件(race condition)
package ThreadConcept;

public class CounterThread extends Thread{
    private static int counter = 0;//shared var for testing
    @Override
    public void run() {
        for(int i = 0; i<1000;i++){
            counter++;
        }

    }
    public static void main(String[] args)throws InterruptedException{
        int num=1000;
        Thread[] threads= new Thread[num];
        for(int i=0;i<num;i++){
            threads[i]=new CounterThread();
            threads[i].start();
        }
        for(int i=0;i<num;i++){
            threads[i].join();
        }
        System.out.println(counter);

    }
}
