public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.print("[");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
