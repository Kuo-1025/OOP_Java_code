class CTest implements Runnable {
    String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep((long) (Math.random() * 3)); // Delay 0 ~ 2 seconds. ( Math.random() * 3 -> [0, 3) )
            } catch (Exception e) { // And it throws InterruptedException, so we need to catch it.

            }
            System.out.println(id + " " + i);
        }
    }
}

public class Class10 {
    public static void main(String[] argv) {
        CTest Hi = new CTest("Hello");
        CTest Bye = new CTest("Good bye");
        CTest Morning = new CTest("Good morning");
        CTest Night = new CTest("Good night");

        Thread hi = new Thread(Hi);
        Thread bye = new Thread(Bye);
        Thread morning = new Thread(Morning);
        Thread night = new Thread(Night);

        hi.start();
        bye.start();
        morning.start();
        night.start();
        // Let them start at the same time.
    }
}