package grades;

import java.util.ArrayList;

public class Student {

//    /* FIELDS */
//    private String name;
//    private ArrayList<Integer> grades = new ArrayList<>();
//
//    /* CONSTRUCTORS */
//    public Student(String name) {
//
//        this.name = name;
//    }
//
//    public Student() {
//
//    }
//
//    // returns the student's name
//    public String getName() {
//        return this.name;
//    }
//
//    // adds the given grade to the grades property
//    public void addGrade(int grade) {
//        this.grades.add(grade);
//    }
//
//    // returns the average of the students grades
//    public double getGradeAverage() {
//        return grades.stream().reduce(0, (sum, currentGrade) -> {
//
//        System.out.println("sum is: " + sum);
//        System.out.println("current element is: " + currentGrade);
//
//        return sum + currentGrade;
//        }) / grades.size();
//    }


    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int newGrade) {
        this.grades.add(newGrade);
    }

    public double getGradeAverage() {
        int totalPoints = this.grades.stream().reduce(0, (sum, currentGradeElement) -> {
            System.out.println("The sum is currently: " + sum);
            System.out.println("The current grade element is: " + currentGradeElement);
            System.out.println("*************************");
            return sum + currentGradeElement;
        });
        return (double) totalPoints / this.grades.size();
    }
}
