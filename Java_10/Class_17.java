class Car {
    protected String owner, id;

    public Car(String own, String s) {
        // (a)

        owner = own;
        id = s;
    }

    final void show() {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼" + id);
    }
}

class CColor extends Car {
    // (b)

    public String color;

    public CColor(String own, String s, String c) {
        /*
         * (c) Create a constructor and use super() with two arguments to call the
         * constructor named car in parents class.
         */

        super(own, s);

        // (e)

        color = c;
    }

    public void showAll() {
        // (d) Overriding show() in parent class.

        // (e) Change the function name from show to showAll.

        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
        System.out.println("車身顏色" + color);
    }
}

public class Class_17 {
    public static void main(String[] argv) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.showAll();

        /*
         * (e)
         * 
         * Due to the final function show() and a new object with three arguments, but
         * it constructor can only use two arguments, this code can't work.
         */
    }
}
