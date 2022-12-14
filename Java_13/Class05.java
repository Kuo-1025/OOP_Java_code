public class Class05 {
    public static void main(String[] argv) {
        int num = 12;
        int den[] = { 12, 0, 3, 0, 0, 4 };

        for (int i = 0; i < 10; ++i) {

            // Use try-catch to avoid the error about divid by zero or index out of range.
            try {
                System.out.println("ans=" + num / den[i] + '\n');
            } catch (ArithmeticException e) {
                System.out.println("程式執行有誤\nAn integer cannot divid by zero.\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("程式執行有誤\nIndex out of range.\n");
                break;
            }
        }
    }
}
