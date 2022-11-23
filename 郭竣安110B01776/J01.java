class Personal {
    String name;
    int bornIn;

    public void show() {
        System.out.println("This parent class ! ! !");
    }
}

class Student extends Personal {
    String id, c1, c2;
    int grade;

    public Student(String nm, int born, String i, int g, String C1, String C2) {
        name = nm;
        bornIn = born;
        id = i;
        grade = g;
        c1 = C1;
        c2 = C2;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("Date of Born:" + bornIn);
        System.out.println("Id:" + id);
        System.out.println("grade:" + grade);
        System.out.println("course1:" + c1);
        System.out.println("course2:" + c2);
        System.out.println("---------------------");
    }
}

class Teacher extends Personal {
    String course;

    public Teacher(String nm, int born, String c) {
        name = nm;
        bornIn = born;
        course = c;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("Date of Born:" + bornIn);
        System.out.println("Course:" + course);
        System.out.println("---------------------");
    }
}

public class J01 {
    public static void main(String[] argv) {
        Personal info[] = new Personal[4];

        info[0] = new Student("張三", 88, "940001", 1, "國文", "英文");
        info[1] = new Student("王五", 87, "930001", 2, "數學", "英文");
        info[2] = new Teacher("張九", 60, "英文");
        info[3] = new Teacher("蕭十", 62, "國文");

        for (int i = 0; i < 4; ++i)
            info[i].show();
    }
}