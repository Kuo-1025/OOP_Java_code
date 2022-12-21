class Add implements Runnable {
    // Create a thread by implementing the Runnable interface

    private int n, sum = 0;

    public Add(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; ++i) {
            sum += i;
            System.out.println(sum);
        }

        System.out.printf("The sum from 1 ~ %d is %d\n", n, sum);
    }
    // To compute the sum of 1 ~ n.
}

public class Class06 {
    public static void main(String[] argv) {
        Add ad5 = new Add(5);
        Add ad10 = new Add(10);

        Thread ad_5 = new Thread(ad5);
        Thread ad_10 = new Thread(ad10);

        ad_5.start();
        ad_10.start();
    }
}
