package grades;

public class StudentApp {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(100);

        System.out.println(student1.getGradeAverage());
    }
}
