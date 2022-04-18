package shapes;

public class Rectangle {

    /* PROPERTIES */
    protected int length;
    protected int width;


    /* CONSTRUCTOR */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    /* CUSTOM METHODS */
    public int getArea() {
        return this.width * this.length;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.width);
    }


}
