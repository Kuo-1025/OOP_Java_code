abstract class Math {
    protected int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public abstract void add(int a, int b);

    public abstract void sub(int a, int b);

    public abstract void mul(int a, int b);

    public abstract void div(int a, int b);
}

class Compute extends Math {
    // Create a class Compute and inherits Math.

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
}

public class Class_02 {
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
    }
}
