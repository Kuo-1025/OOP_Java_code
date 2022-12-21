class CTest implements Runnable {
    // Create a thread by implementing the Runnable interface

    String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(id + " " + i);
        }
    }
}

public class Class07 {
    public static void main(String[] argv) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");

        Thread Hi = new Thread(hi);
        Thread Bye = new Thread(bye);
        Thread Morning = new Thread(morning);

        Hi.start();
        Bye.start();
        Morning.start();
        // Let three of them start at the same time.
    }
}