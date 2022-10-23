class Caaa {
    // Creat a class -> Caaa()

    public int num1, num2;

    public Caaa() {
        // (a) Create a constructor without any argument, then set num1 and num2 to 1.

        num1 = 1;
        num2 = 1;
    }

    public Caaa(int a, int b) {
        /*
         * (b) Create a overloading with two arguments a and b, then set num1 and num2
         * to a and b respectively.
         */

        num1 = a;
        num2 = b;
    }
}

class Cbbb extends Caaa {
    // Creat a class and extends from Caaa -> Cbbb()

    public Cbbb() {
        // To call the constructor from parent class.

        super();
    }

    public Cbbb(int a, int b) {
        // (c) To call the constructor from parent class.

        super(a, b);
    }

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

public class Class_03 {
    public static void main(String[] argv) {
        Cbbb bb1 = new Cbbb();
        bb1.show();

        Cbbb bb2 = new Cbbb(48763, 36784);
        bb2.show();
    }
}