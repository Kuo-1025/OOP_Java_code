public class Class07 {
    public static void main(String[] argv) {
        int num = 12, den = 0;

        try {
            test(num, den);
        } catch (ArithmeticException e) {
            System.out.println("除數為 0");
        } finally {
            System.out.println("end of main()");
        }
    }

    // Use test() and throws Exception if divid by zero.
    public static void test(int num, int den) throws ArithmeticException {
        System.out.printf("ans = %d\n", num / den);
    }
}
