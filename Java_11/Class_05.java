interface Math {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class Compute implements Math {
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

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class_05 {
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
