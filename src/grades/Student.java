package grades;

import java.util.ArrayList;

public class Student {

    /* FIELDS */
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    /* CONSTRUCTORS */
    public Student(String name) {

        this.name = name;
    }

    public Student() {

    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return grades.stream().reduce(0, (sum, currentGrade) -> {

        System.out.println("sum is: " + sum);
        System.out.println("current element is: " + currentGrade);

        return sum + currentGrade;
        }) / grades.size();
    }
}
