public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.print("]");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
