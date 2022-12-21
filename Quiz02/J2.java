import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J2 {
    public static void main(String[] argv) throws IOException {
        FileWriter Fw = new FileWriter("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Quiz02\\rand.txt");
        BufferedWriter Bw = new BufferedWriter(Fw);

        for (int i = 0; i < 1000; ++i)
            Bw.write(Integer.toString((int) (Math.random() * 99999 + 1)) + "\r\n");

        Bw.flush();
        Fw.close();
    }
}
