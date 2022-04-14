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
    public int getArea(int length, int width) {
        return width * length;
    }

    public int getPerimeter(int length, int width) {
        return 2 * (length + width);
    }


}
