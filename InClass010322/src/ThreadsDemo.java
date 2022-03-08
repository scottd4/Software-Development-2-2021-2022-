import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsDemo extends Thread {

    public String name;
    public static int counter = 10;

    public static Lock lock = new ReentrantLock();

    public ThreadsDemo(String name)
    {
        this.name = name;
    }

    public void run()
    {


        while (true) {
            lock.lock();// 1 inst
                if (counter == 0)
                    break;
                System.out.println("Thread " + name + " value " + counter);
                counter--;// 3 clock ticks
            lock.unlock();//1 inst
            try {

                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        ThreadsDemo t1 = new ThreadsDemo("T1");
        ThreadsDemo t2 = new ThreadsDemo("T2");
        ThreadsDemo t3 = new ThreadsDemo("T3");
        ThreadsDemo t4 = new ThreadsDemo("T4");
        ThreadsDemo t5 = new ThreadsDemo("T5");
        ThreadsDemo t6 = new ThreadsDemo("T6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();




    }
}