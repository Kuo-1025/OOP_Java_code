import java.io.*;

public class Class06 {
    public static void main(String[] args) {
        // Use try_catch to catch IOException exception.
        try {
            FileReader fr = new FileReader(
                    "C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\train.txt");
            // Read the file.

            char data[] = new char[128];

            int num = fr.read(data);
            /*
             * (a) First, put the character from the file into info[], then return its
             * length.
             */

            fr.close();

            String str = new String(data, 0, num);

            System.out.println("character count:" + num);

            System.out.println(str);

        } catch (IOException e) {

        }
    }
}