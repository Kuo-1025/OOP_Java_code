public class Class04 {
    public static void main(String[] argv) {
        int num = 12;
        int den[] = { 12, 0, 3, 0, 0, 4 };

        for (int i = 0; i < 10; ++i) {

            // The index is out of range.
            if (i == 6) {
                System.out.println("程式執行有誤\nIndex out of range.");
                break;
            }

            // An integer cannot divid by zero.
            if (den[i] == 0) {
                System.out.println("程式執行有誤\nAn integer cannot divid by zero.");
            } else {
                System.out.println("ans=" + num / den[i]);
            }
        }
    }
}
