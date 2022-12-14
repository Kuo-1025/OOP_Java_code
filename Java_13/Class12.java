class NotTriangle extends Exception {
}

class EquilateralTriangle extends Exception {
}

class NotEquilateralTriangle extends Exception {
}

public class Class12 {
    public static void main(String[] argv) {
        int a = 3, b = 3, c = 3;
        String res = "";

        // Use try-catch to catch the exception triangle() throwed.
        try {
            triangle(a, b, c);
        } catch (NotTriangle e) {
            res = "不構成三角形";
        } catch (EquilateralTriangle e) {
            res = "這是正三角形";
        } catch (NotEquilateralTriangle e) {
            res = "這不是正三角形";
        }

        System.out.println(res);
    }

    // Use triangle() to throw exception.
    public static void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        if ((a + b) < c || (a + c) < b || (b + c) < a)
            throw new NotTriangle();

        else if (a == b && b == c && a == c)
            throw new EquilateralTriangle();

        else
            throw new NotEquilateralTriangle();
    }
}
