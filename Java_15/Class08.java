class CTest implements Runnable {
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

public class Class08 {
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