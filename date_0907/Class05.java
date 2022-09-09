class CBox {
    int length, width, height;

    int volume() {
        return length * width * height;
    }

    int surfaceArea() {
        return length * width * 2 + width * height * 2 + length * height * 2;
    }

    void showData() {
        System.out.printf("length = %d\n", length);
        System.out.printf("width = %d\n", width);
        System.out.printf("height = %d\n", height);
    }

    void showAll() {
        System.out.printf("length = %d\n", length);
        System.out.printf("width = %d\n", width);
        System.out.printf("height = %d\n", height);
        System.out.printf("surfaceArea = %d\n", surfaceArea());
        System.out.printf("volume = %d\n", volume());
    }
}

public class Class05 {
    public static void main(String[] argv) {
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
    }
}
