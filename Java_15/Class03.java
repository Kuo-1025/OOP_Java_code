class CTest extends Thread {
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

public class Class03 {
    public static void main(String[] argv) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");

        hi.start();
        bye.start();
        // Let hi and bye start at the same time.
    }
}