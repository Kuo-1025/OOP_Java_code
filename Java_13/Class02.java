public class Class02 {
    public static void main(String[] argv) {
        int num = 12, den = 0;

        // Do the division if den isn't zero.
        if (den != 0)
            System.out.printf("ans = %d\n", num / den);
        else
            System.out.println("除數為 0");

        System.out.println("end of main()");
    }
}