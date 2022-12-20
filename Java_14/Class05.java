import java.io.FileReader; // Import related class which you need from java.io library.
import java.io.IOException;

public class Class05 {
    public static void main(String[] argv) throws IOException {
        FileReader Fr = new FileReader("C:/Users/user/OneDrive/文件/GitHub/OOP_Java_code/Java_14/donkey.txt");
        // Read the file.

        Fr.skip(9); // skip "我有一隻小毛驢\r\n" nine characters.

        char info[] = new char[128];

        int res = Fr.read(info);
        /*
         * (a) First, put the character from the file into info[], then return its
         * length.
         */

        Fr.close();

        String s = "";
        for (char c : info)
            s += c;

        System.out.println("Total Charactor : " + res);
        System.out.println(s);
    }
}