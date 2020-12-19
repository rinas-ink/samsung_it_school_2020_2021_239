import java.util.concurrent.atomic.AtomicInteger;

public class TicTac {

    // 1. task implements Runnable -> Thread(runnable)
    // 2. task extends Thread

    // 1. wait, notify, notifyAll
    // 2. (T1 -> [), (T2 -> ]) -> [][][][][][]
    static int counter = 0;
    static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

        Runnable tic = () -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (monitor) {
                    counter++; // 1. counter 2. value 3. increment 4. value
                }
            }
        };

        Runnable tac = () -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (monitor) {
                    counter++; // 1. counter 2. value 3. increment 4. value
                }
            }
        };

        Thread thread = new Thread(tic);
        Thread thread1 = new Thread(tac);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join(); // <---

        System.out.println(counter);
    }
}
