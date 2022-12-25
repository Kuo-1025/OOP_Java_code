class runTime implements Runnable {
    String user;
    double seconds;

    public runTime(String u, double sec) {
        user = u;
        seconds = sec;
    }

    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep((long) (seconds * 1000)); // Delay seconds seconds.
            } catch (Exception e) { // And it throws InterruptedException, so we need to catch it.

            }

            System.out.printf("Thread %s is running\n", user);
        }
    }
}

public class Class09 {
    public static void main(String[] argv) {
        runTime test1 = new runTime("1", 1);
        runTime test2 = new runTime("2", 2.5);

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);

        t1.start();
        t2.start();
    }
}
