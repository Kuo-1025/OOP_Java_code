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

public class Class12 {
    public static void main(String[] argv) {
        CTest Hi = new CTest("Hello");
        CTest Bye = new CTest("Good bye");
        CTest Morning = new CTest("Good morning");
        CTest Night = new CTest("Good night");

        Thread hi = new Thread(Hi);
        Thread bye = new Thread(Bye);
        Thread morning = new Thread(Morning);
        Thread night = new Thread(Night);

        hi.start(); // Start hi execution thread first.

        try {
            hi.join();
            /*
             * Limit dog thread execution to the end and then the code below can be
             * executed.
             */

            morning.start();
            morning.join();
            /*
             * Limit morning thread execution to the end and then the code below can be
             * executed.
             */

            night.start();
            night.join();
            /*
             * Limit night thread execution to the end and then the code below can be
             * executed.
             */

            bye.start();
            bye.join();
            /*
             * Limit bye thread execution to the end and then the code below can be
             * executed.
             */

        } catch (Exception e) {

        }
    }
}