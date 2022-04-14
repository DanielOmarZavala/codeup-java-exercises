package shapes;

public class Square extends Rectangle {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea(int length, int width) {
        int side = length;

        return 4 * side;
    }

//    @Override
//    public int getPerimeter(int length, int width) {
//        return super.getPerimeter(length, width);
//    }
}
