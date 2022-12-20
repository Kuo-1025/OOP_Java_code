class CTest extends Thread {
    /*
     * (a) Build a CTest class inherited from Thread class,
     * and build a constructor CTest with an argument str
     * to set id's value to str.
     */

    String id;

    public CTest(String str) {
        id = str;
    }

    // (b)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(id + " " + i);
        }
    }
}

public class Class02 {
    public static void main(String[] argv) {

        // (c)
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");

        hi.run();
        bye.run();
    }
}

/*
 * (d)
 * 
 * Hello 1
 * Hello 2
 * Hello 3
 * Hello 4
 * Hello 5
 * Good bye 1
 * Good bye 2
 * Good bye 3
 * Good bye 4
 * Good bye 5
 * 
 * Because hi.run() is called first.
 */