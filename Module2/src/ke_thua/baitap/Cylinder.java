package ke_thua.baitap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

        this.height = 1;
    }
    public Cylinder(double height) {

        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){

        return height;
    }
    public void setHeight(double height){

        this.height = height;
    }
    @Override
    public String toString() {
        return "Cylinder with height = " + getHeight()
                + " is a subclass of Circle with radius =  "+ getRadius();
    }

}
