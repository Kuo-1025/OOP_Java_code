import java.util.*;

class Cbbb {
    double x, y;
}

class Class02 {
    public static void main(String[] args) {
        Cbbb obj1 = new Cbbb();
        obj1.x = 5.2;
        obj1.y = 3.9;

        Cbbb obj2 = new Cbbb();
        obj2.x = 6.5;
        obj2.y = 4.6;

        Cbbb avg = new Cbbb();
        avg.x = (obj1.x + obj2.x) / 2;
        avg.y = (obj1.y + obj2.y) / 2;

        System.out.printf("obj1.x = %.f, obj1.y = %.f\n", obj1.x, obj1.y);
        System.out.printf("obj2.x = %.f, obj2.y = %.f\n", obj2.x, obj2.y);
        System.out.printf("avg.x = %.f, avg.y = %.f\n", avg.x, avg.y);
    }
}