import java.util.Scanner;

class StudentTest {
    public static void main(String[] args) {
        Student diagram1 = new Student("ALI", 14, 87);

        System.out.println("ENTER YOUR NAME");

        String name = diagram1.getName();

        System.out.printf("%s%n", name);
    }
}
