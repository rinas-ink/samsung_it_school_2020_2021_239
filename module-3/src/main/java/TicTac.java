import java.util.concurrent.atomic.AtomicInteger;

public class TicTac {

    // 1. task implements Runnable -> Thread(runnable)
    // 2. task extends Thread

    int num = 0;

    Runnable r1 = () -> {
        while (true) {
            synchronized (this) {
                num = (num + 1) % 100000 + 1;
                System.out.print("[");
                try {
                    notify();
                    wait();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable r2 = () -> {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                    System.out.print("]");
                    try {
                        notify();
                        wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };


    void calc() {
        new Thread(r1).start();
        new Thread(r2).start();
    }

    public static void main(String[] args) throws InterruptedException {
        new TicTac().calc();
    }
}
