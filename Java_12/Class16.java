public class Class16 {
    public static void main(String[] argv) {

        String str = "262904713";
        int res = 0;

        // Check whether the value of str is a number or not.
        try {

            res = Integer.parseInt(str);

        } catch (Exception e) {

            System.out.println("The value of str isn't a number ! ! !");
            return;

        }

        System.out.println(str + " * 2 = " + res * 2);
    }
}
