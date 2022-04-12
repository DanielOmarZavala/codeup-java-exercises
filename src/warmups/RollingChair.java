package warmups;

public class RollingChair {


    public static void main(String[] args) {
        RollingChair rc1 = new RollingChair();
        RollingChair rc2 = new RollingChair(5, "Cool Style", true);

        rc1.setNoOfWheels(5);
        rc1.setStyle("Mid Century Modern");
        rc1.setHasArms(true);

        rc1.roll();
        System.out.println(rc1.getStyle());
        System.out.println(rc2.getStyle());
    }

//    PROPERTIES

    private int noOfWheels;
    private String style;
    private boolean hasArms;

//    CONSTRUCTORS

    public RollingChair() {
    }

    public RollingChair(int noOfWheels, String style, boolean hasArms) {
        this.noOfWheels = noOfWheels;
        this.style = style;
        this.hasArms = hasArms;
    }

//    GETTERS AND SETTERS

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isHasArms() {
        return this.hasArms;
    }

    public void setHasArms(boolean hasArms) {
        this.hasArms = hasArms;
    }

//    CUSTOM METHODS

    public void roll() {
        System.out.println("Rollin rollin rollin");
    }



}