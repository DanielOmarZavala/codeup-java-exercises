public class Person {

    public static void main(String[] args) {

//        Person p1 = new Person("Johnny");
//
//        p1.sayHello();
//
//        p1.setName("Domingo");
//        System.out.println(p1.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    private String name;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void sayHello() {

        System.out.printf("Hello %s.\n", this.name);
    }
}

/* The class should have a constructor that accepts a `String` value and sets
the person's name to the passed string.

Create a `main` method on the class that creates a new `Person` object and
tests the above methods. */


