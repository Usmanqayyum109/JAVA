public class Student {
    private String name;

    private double age;

    private int marks;

    public Student(String name, double age, int marks)

    {
        this.name = name;

        this.age = age;

        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
