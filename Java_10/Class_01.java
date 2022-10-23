class Caaa {
    // Creat a class -> Caaa()

    public int num1, num2;
}

class Cbbb extends Caaa {
    // Creat a class and inherits Caaa -> Cbbb()

    public void set_num(int b_num1, int b_num2) {
        // Set num1 and num2 extended from Caaa.

        num1 = b_num1;
        num2 = b_num2;
    }

    public void show() {
        // Print num1 and num2.

        System.out.println("num1 = " + num1 + '\n' + "num2 = " + num2);
    }
}

public class Class_01 {
    public static void main(String[] argv) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}