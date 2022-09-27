class add {
    // Define a class -> add.

    public static void add2n(int n) {
        // Define a static function to calculate the sum from 1 to n.

        System.out.println((1 + n) * n / 2);
    }
}

public class Class_06 {
    public static void main(String[] argv) {
        add.add2n(5);
        add.add2n(10);
    }
}
