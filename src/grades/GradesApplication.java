package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Student student1 = new Student("Fred");
        Student student2 = new Student("Jack");
        Student student3 = new Student("Georgie");
        Student student4 = new Student("Posty");

        HashMap<String, Student> students = new HashMap<>();

        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(30);

        student2.addGrade(80);
        student2.addGrade(70);
        student2.addGrade(90);

        student3.addGrade(100);
        student3.addGrade(70);
        student3.addGrade(70);

        student4.addGrade(80);
        student4.addGrade(80);
        student4.addGrade(80);

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);


    }
}
