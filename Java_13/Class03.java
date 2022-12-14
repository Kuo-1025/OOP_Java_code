public class Class03 {
    public static void main(String[] argv) {
        int num = 12, den = 0, ans = 48763;

        // Use try-catch-finally to avoid the problem about divid zero.
        try {
            ans = num / den;
        } catch (ArithmeticException e) {
            ans = -1;
        } finally {
            System.out.printf("ans = %d\n", ans);
            System.out.println("end of main()");
        }

    }
}