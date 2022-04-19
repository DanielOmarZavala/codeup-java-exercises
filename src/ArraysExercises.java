import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] peoples = new Person[3];
        peoples[0] = new Person("Dan");
        peoples[1] = new Person("Pan");
        peoples[2] = new Person("Han");



        for (Person person : peoples) {

            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] personArr, Person personToAdd) {
        Person[]
    }

//    class Person {
//        String name;
//
//        Person(String name) {
//            this.name = name;
//        }
//
//        public void showData() {
//            System.out.println(this.name);
//        }
//    }


}
