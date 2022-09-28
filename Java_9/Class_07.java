class Cpow {
    // Define a class -> Cpow.

    public static void power(int x, int n) {
        // Define a static function to calculate x to the power of n.

        int res = 1;

        for (int i = 0; i < n; ++i)
            res *= x;

        System.out.println(res);
    }
}

public class Class_07 {
    public static void main(String[] argv) {
        Cpow.power(2, 5);
        Cpow.power(3, 2);
    }
}
