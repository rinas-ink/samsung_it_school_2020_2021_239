import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Multiple {


    // () -> A
    // () -> B
    // () -> C
    // A B C A B C A B C ....
    AtomicInteger cnt = new AtomicInteger();
    ArrayList<Integer> list = new ArrayList<>();
    // 0 1 2 3
    // 1. cnt, 2. cnt + 1, 3. cnt
    // 0 1 3 3

    Runnable r1 = () -> {
        for (int i = 0; i < 1000000; i++) {
            cnt.incrementAndGet();
        }
    };

    Runnable r2 = () -> {
        for (int i = 0; i < 1000000; i++) {
            cnt.incrementAndGet();
        }
    };

    boolean finish = false;

    Runnable r3 = () -> {
        for (int i = 0; i < 20; i++) {
            synchronized (this) {
                list.add(i);
                System.out.println("Added: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finish = true;
    };

    Runnable r4 = () -> {
        while (!finish) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                for (Integer integer : list) {
                    System.out.println(integer);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    void calc() throws InterruptedException {
        Thread thread = new Thread(r3);
        thread.start();
        Thread thread1 = new Thread(r4);
        thread1.start();
        thread.join();
        thread1.join();
    }

    public static void main(String[] args) throws InterruptedException {
        Multiple ticTac = new Multiple();
        ticTac.calc();
    }
}
