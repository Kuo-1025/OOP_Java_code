class CBox {
    int length, width, height;
}

public class Class04 {
    public static void main(String[] argv) {
        CBox box = new CBox();
        box.length = 15;
        box.width = 10;
        box.height = 25;

        System.out.printf("length = %d\n", box.length);
        System.out.printf("width = %d\n", box.width);
        System.out.printf("height = %d", box.height);
    }
}
