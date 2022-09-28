class Data {
    private String name;
    private Test score;

    class Test {
        // (a) Define a class type -> Test with 2 members which named english, math.

        public int english, math;

        public Test(int eng, int m) {
            /*
             * (b) Define a constructor -> Test() with 2 arguments which named eng, m
             * to set english to eng, and math to m.
             */

            english = eng;
            math = m;
        }

        double avg() {
            // (c) Calculate the average of english and math, then return.

            return (english + math) * 1.0 / 2;
        }
    }

    public Data(String Na, int En, int Ma) {
        name = Na;

        score = new Test(En, Ma);
    }

    public void show() {
        // (d) Print all of the members in Data.
        System.out.println("學生姓名:" + name);
        System.out.println("英文成績:" + score.english);
        System.out.println("數學成績:" + score.math);
        System.out.println("平均成績:" + score.avg());
    }
}

public class Class_19 {
    public static void main(String[] argv) {
        // (e)

        Data stu = new Data("Annie", 85, 92);
        stu.show();
    }
}
