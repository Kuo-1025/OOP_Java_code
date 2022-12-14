class Ctest {

    // Build test() in class Ctest and throws ArithemeticException if divid by zero.
    public void test(int num, int den) throws ArithmeticException {
        System.out.printf("ans = %d\n", num / den);
    }
}

public class Class08 {
    public static void main(String[] argv) {
        int num = 12, den = 0;

        Ctest ct = new Ctest();

        try {
            ct.test(num, den);
        } catch (ArithmeticException e) {
            System.out.println("除數為 0");
        } finally {
            System.out.println("end of main()");
        }
    }
}
