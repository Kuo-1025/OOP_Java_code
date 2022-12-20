import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Class10 {
    public static void main(String[] argv) throws IOException {
        FileWriter Fw = new FileWriter("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\rand.txt");
        BufferedWriter Bw = new BufferedWriter(Fw);

        for (int i = 0; i < 1000; ++i)
            Bw.write(Integer.toString((int) (Math.random() * 99999) + 1) + "\r\n");
        /*
         * (a) Generate 1000 integer random numbers from 1 to 99999, and write them into
         * rand.txt.
         */

        Bw.flush();
        Fw.close();

        FileReader Fr = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\rand.txt");
        BufferedReader Br = new BufferedReader(Fr);

        int save[] = new int[1000];
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int tmp = 0, Sum = 0, idx = 0;
        String num = "";

        while ((num = Br.readLine()) != null) {
            tmp = Integer.parseInt(num);

            save[idx++] = tmp;

            Sum += tmp;
            mx = mx < tmp ? tmp : mx; // (b) Find the Maxium.
            mn = mn > tmp ? tmp : mn; // (b) Find the Minium.
        }

        Fr.close();

        System.out.printf("Maxium number : %d\n", mx);
        System.out.printf("Minium number: %d\n", mn);
        System.out.printf("Average of these 1000 numbers : %.3f\n", Sum / 1000.0);
        // (b) Calculate the Average of these 1000 numbers.

        Arrays.sort(save); // (c) Use Arrays.sort() to sort these 1000 numbers form small to large.

        FileWriter Fw2 = new FileWriter("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\rand2.txt");
        BufferedWriter Bw2 = new BufferedWriter(Fw2);

        for (int n : save)
            Bw2.write(Integer.toString(n) + "\r\n");

        Bw2.flush();
        Fw2.close();
    }
}