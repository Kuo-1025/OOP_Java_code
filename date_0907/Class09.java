class CCalculator {
    int a, b, c;

    void set_value(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    void show() {
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
        System.out.printf("c = %d\n", c);
    }

    int add() {
        return a + b + c;
    }

    int sub() {
        return a - b - c;
    }

    int mul() {
        return a * b * c;
    }

    double avg() {
        return (a + b + c) * 1.0 / 3;
    }
}

public class Class09 {
    public static void main(String[] argv) {
        CCalculator cal = new CCalculator();

        cal.set_value(25, 3, 7);
    }
}
