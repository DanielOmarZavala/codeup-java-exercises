//package grades;
//
//import util.Input;
//
//import java.util.HashMap;
//
//public class GradesApplication {
//
//    public static void main(String[] args) {
//
//
//        Student student1 = new Student("Fred");
//
//        student1.addGrade(80);
//        student1.addGrade(90);
//        student1.addGrade(30);
//
//        Student student2 = new Student("Jack");
//
//        student2.addGrade(80);
//        student2.addGrade(70);
//        student2.addGrade(90);
//
//        Student student3 = new Student("Georgie");
//
//        student3.addGrade(100);
//        student3.addGrade(70);
//        student3.addGrade(70);
//
//        Student student4 = new Student("Posty");
//
//        student4.addGrade(80);
//        student4.addGrade(80);
//        student4.addGrade(80);
//
//        HashMap<String, Student> students = new HashMap<>();
//
//        students.put(student1.getName(), student1);
//        students.put(student2.getName(), student2);
//        students.put(student3.getName(), student3);
//        students.put(student4.getName(), student4);
//
////        for (int i = 0; i < students.size(); i++) {
////            System.out.println("iterating");
////            System.out.println(student[i].getName());
////        }
//
////        System.out.println(students.containsKey(student1.getName()));
////        System.out.println(students.containsKey(student2.getName()));
////        System.out.println(students.containsKey(student3.getName()));
////        System.out.println(students.containsKey(student4.getName()));
//
//        System.out.println(student1.getName());
//        System.out.println(student2.getName());
//        System.out.println(student3.getName());
//        System.out.println(student4.getName());
//
////        System.out.println(students.keySet().stream().reduce("", (allNames, currentName) -> {
////            return allNames + "\n -> " + currentName;
////        }));
//
//        for (String key : students.keySet()) {
//            System.out.println(key);
//        }
//
//        String username = Input.getString("\nPlease enter the GitHub username of a student if you want more info: \n");
//
//        System.out.println(students.get(username).getGradeAverage());
//    }
//}
