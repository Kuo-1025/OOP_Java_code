import java.io.BufferedReader;
import java.io.FileReader; // Import related class which you need from java.io library.
import java.io.IOException;

public class Class07 {
    public static void main(String[] argv) throws IOException {
        FileReader Fr = new FileReader("C:/Users/user/OneDrive/文件/GitHub/OOP_Java_code/Java_14/donkey.txt");
        // Read the file.

        BufferedReader Br = new BufferedReader(Fr);

        String s;
        for (int i = 0; (s = Br.readLine()) != null; ++i) {
            if (i == 1)
                Br.skip(14);
            // skip "有一天我心血來潮騎著去趕集" thirteen characters.

            System.out.println(s);
        }

        Br.close();
        Fr.close();
    }
}