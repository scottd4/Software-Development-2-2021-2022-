import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TimerDemo {
    public String name;
    public static int counter = 0;
    //public static int lastValue = 0;

    //f
    // public static Lock lock = new ReentrantLock();

    public TimerDemo()
    {
        Thread t1 = new Thread(new TimerStart());
        t1.start();

        Thread t2 = new Thread(new WatchTime());
        t2.start();

    }

    class TimerStart implements Runnable
    {

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(1000);
                    counter++;
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Counter Thread: " + counter);
            }

        }
    }

    class WatchTime implements Runnable
    {

        @Override
        public void run() {
            while (true) {
                Scanner sc = new Scanner(System.in);
                if (sc.next() != null) {
                    System.out.println("Split Counter: " + counter);
                }
            }
        }


    }

    public static void main(String[] args) {
        new TimerDemo();
    }



}
