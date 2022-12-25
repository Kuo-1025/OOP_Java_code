class CTest extends Thread {
    String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1500L); // Delay 1.5 seconds.
            } catch (Exception e) { // And it throws InterruptedException, so we need to catch it.

            }
            System.out.println(id + " " + i);
        }
    }
}

public class Class10 {
    public static void main(String[] argv) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");

        hi.start();
        bye.start();
        morning.start();
        night.start();
        // Let them start at the same time.
    }
}