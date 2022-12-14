public class Class02 {
    public static void main(String[] argv) {
        int num = 12, den = 0, ans = -1;

        // Do the division if den isn't zero.
        if (den != 0)
            ans = num / den;

        System.out.printf("ans = %d\n", ans);
        System.out.println("end of main()");
    }
}