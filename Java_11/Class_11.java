interface Data {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
}

class Cstu implements Data, Test {
    protected String id, name; // 學號, 姓名
    protected int mid, finl, common; // 期中考成績, 期末考成績, 平時成績

    public Cstu(String i, String nm, int m, int fl, int cmn) {
        id = i;
        name = nm;
        mid = m;
        finl = fl;
        common = cmn;
    }

    public void showData() {
        // Show id and name.

        System.out.println("學號: " + id);
        System.out.println("姓名: " + name);
    }

    public void showScore() {
        // Show each score.

        System.out.println("期中考成績: " + mid);
        System.out.println("期末考成績: " + finl);
        System.out.println("平時成績: " + common);
        System.out.println("學期成績: " + calcu());
    }

    public double calcu() {
        // Compute semester score.

        return (mid + finl) * 0.3 + common * 0.4;
    }

    public void show() {
        // Print all.

        showData();
        showScore();
    }
}

public class Class_11 {
    public static void main(String[] argv) {
        Cstu stu = new Cstu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
