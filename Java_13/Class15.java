import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class ArgumentOutOfBound extends Exception {
}

public class Class15 {
    public static void main(String[] argv) throws IOException { // IOException is thrown by main().

        // Use BufferedReader to input n.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        br.close();

        int n = Integer.parseInt(s);

        try {
            mySqrt(n);
        } catch (ArgumentOutOfBound e) {
            System.out.printf("%d小於0\n", n);
        }
    }

    // Build mySqrt(), and throws SrgumentOutOfBound if n is smaller than zero.
    public static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n < 0)
            throw new ArgumentOutOfBound();

        else
            System.out.println(Math.sqrt(n));
    }
}
