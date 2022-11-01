interface Math {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

interface AdvancedMath {
    public void mod(int a, int b); // Compute a % b.

    public void fac(int a); // Compute a! (1 * 2 * 3 * ... * a).

    public void pow(int a, int b); // Compute a ^ b.
}

class Compute implements Math, AdvancedMath {
    // Create a class Compute implements interface iAaa and AdvancedMath.

    public int ans;

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        ans = 1;

        for (int i = 2; i <= a; ++i) {
            ans *= i;
        }
    }

    public void pow(int a, int b) {
        ans = 1;

        for (int i = 0; i < b; ++i) {
            ans *= a;
        }
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class_09 {
    public static void main(String[] argv) {
        Compute cmp = new Compute();
        cmp.add(3, 5);
        cmp.show();

        cmp.sub(3, 5);
        cmp.show();

        cmp.mul(3, 5);
        cmp.show();

        cmp.div(3, 5);
        cmp.show();

        cmp.mod(3, 5);
        cmp.show();

        cmp.fac(5);
        cmp.show();

        cmp.pow(3, 5);
        cmp.show();
    }
}
