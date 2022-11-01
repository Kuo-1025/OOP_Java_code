interface Data {
    public void best();

    public void failed();
}

interface Test extends Data {
    public void showData();

    public double average();
}

class Cstu implements Test {
    protected String name;
    protected int math, english;

    public Cstu(String nm, int m, int e) {
        name = nm;
        math = m;
        english = e;
    }

    public void showData() {
        System.out.println("姓名:" + name);
        System.out.println("數學成績:" + math);
        System.out.println("英文成績:" + english);
        System.out.println("平均成績:" + average());
    }

    public double average() {
        return (math + english) / 2.0;
    }

    public void best() {
        String tmp;

        if (math > english) {
            tmp = "的數學比英文好";
        } else if (english > math) {
            tmp = "的英文比數學好";
        } else {
            tmp = "的數學和英文一樣好";
        }

        System.out.println(name + tmp);
    }

    public void failed() {
        String tmp;

        if (math < 60 && english < 60) {
            tmp = "的英文和數學都當掉了";
        } else if (math < 60) {
            tmp = "的數學當掉了";
        } else if (english < 60) {
            tmp = "的英文當掉了";
        } else {
            tmp = "的英文和數學都及格了";
        }

        System.out.println(name + tmp);
    }

    public void show() {
        showData();
        best();
        failed();
    }
}

public class Class_12 {
    public static void main(String[] argv) {
        Cstu stu = new Cstu("judy", 58, 91);
        stu.show();
    }
}
