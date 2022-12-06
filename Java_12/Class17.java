public class Class17 {
    public static void main(String[] argv) {

        System.out.println("The range of short is from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ".\r\n");

        String str = "262904713";
        short res = 0;

        // It'll show you an error about value of str is out of the range of short.
        res = Short.parseShort(str);

        /*
         * And you can use try-catch to check first,
         * if there's an error, it'll go to catch.
         * 
         * try {
         * 
         * res = Short.parseShort(str);
         * 
         * } catch (Exception e) {
         * 
         * System.out.println(str + " is out of the range of short ! ! !");
         * 
         * }
         */

        System.out.println(str + " * 2 = " + res * 2);

    }
}
