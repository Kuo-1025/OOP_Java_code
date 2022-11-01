interface iAaa {
    public void show();
}

class Cbbb {
    public int num = 10;

    public void set(int n) {
        num = n;
    }
}

class Cccc extends Cbbb implements iAaa {
    // Create a class Cccc inherits Cbbb and implements interface iAaa.

    public void show() {
        System.out.println("num=" + num);
    }
}

public class Class_08 {
    public static void main(String[] argv) {
        Cccc cc = new Cccc();
        cc.set(5);
        cc.show();
    }
}
