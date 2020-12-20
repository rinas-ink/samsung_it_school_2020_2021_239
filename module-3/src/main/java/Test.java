public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(new MyRunnable());
        mt.start();
        t.start();
    }
}
