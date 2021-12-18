public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread before: " + t);

//        Change the name of current thread.
        t.setName("My Thread renamed.");
        System.out.println("Current thread after: " + t);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted exception caught.");
        }
    }
}
