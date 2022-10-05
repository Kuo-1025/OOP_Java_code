class Data {
    private String name;
    private Test score;

    class Test {
        // (1) Define a class type -> Test with 2 members which named english, math.

        public int english, math;

        public Test(int eng, int m) {
            /*
             * (2) Define a constructor -> Test() with 2 arguments which named eng, m
             * to set english to eng, and math to m.
             */

            english = eng;
            math = m;
        }

        public double avg() {
            // (3) Calculate the average of english and math, then return.

            return (english + math) / 2.0;
        }
    }

    public void show() {
        // (4) Print all of the members in Data.
        System.out.printf("name : %s english = %d math = %d avg = %.1f\n", name, score.english, score.math,
                score.avg());
    }

    public Data(String na, int eng, int ma) {
        name = na;

        score = new Test(eng, ma);
    }
}

public class Class02 {
    public static void main(String[] argv) {
        // (5)

        Data info[] = new Data[2];
        info[0] = new Data("Annie", 85, 92);
        info[1] = new Data("Brian", 77, 56);

        info[0].show();
        info[1].show();
    }
}
