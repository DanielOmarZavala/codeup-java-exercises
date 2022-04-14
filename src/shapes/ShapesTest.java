package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        /* VARIABLES & INSTANCES */
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        /* RECTANGLE CODE EXAMINATIONS */
        System.out.println("Start of Rectangle Tests: \n" + "Area: " + box1.getPerimeter(box1.length, box1.width));
        System.out.println("Perimeter: " + box1.getArea(box1.length, box1.width));

        System.out.println("");

        /* SQUARE CODE EXAMINATIONS */
        System.out.println("Start of Square Tests: \n" + "Area: " + box2.getPerimeter(box2.length, box2.width));
        System.out.println("Perimeter: " + box2.getArea(box2.length, box2.width));

    }
}
