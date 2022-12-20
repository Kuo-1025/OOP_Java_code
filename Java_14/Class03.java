import java.io.BufferedReader; // Import related class which you need from java.io library.
import java.io.IOException;
import java.io.InputStreamReader;

public class Class03 {
    public static void main(String[] argv) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String inp = Br.readLine();

        int n = Integer.parseInt(inp);
        int Sum = (1 + n) * n / 2; // Calculate the sum of 1 ~ n with Time Complexity O(1).

        System.out.printf("1 + 2 + . . . + %d = %d\n", n, Sum);
    }
}
