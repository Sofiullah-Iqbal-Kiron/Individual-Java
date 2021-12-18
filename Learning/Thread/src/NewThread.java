public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--)
            System.out.println("Child thread: " + i);

        System.out.println("Exiting child thread.");
    }
}
