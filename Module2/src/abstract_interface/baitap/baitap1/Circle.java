package abstract_interface.baitap.baitap1;

public class Circle extends Shape implements Resizeable{
    private double radius;
    private String name = "hình tròn";

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public void resize(double percent) {

        this.radius = percent*this.radius/100;
    }

    @Override
    public String toString() {
        return "Circle {"
                + "radius : " + radius
                + "} "
                + "Area :" + this.getArea();
    }
}