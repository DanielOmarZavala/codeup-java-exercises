package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {

        this.name = name;
    }

    public Student() {

    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
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
