package ke_thua.baitap;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getArea(){

        return Math.PI*Math.pow(this.radius, 3);
    }
    @Override
    public String toString() {

        return "Circle with radius = " + getRadius();
    }
}
