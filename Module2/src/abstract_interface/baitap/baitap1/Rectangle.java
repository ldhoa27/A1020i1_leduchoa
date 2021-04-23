package abstract_interface.baitap.baitap1;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    private String name = "Hinh Chu Nhat";

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }


    @Override
    public String toString() {
        return "Rectangle {"
                + "width : " + this.width
                + ", height : " + this.height
                + "} "
                + "Area :" + this.getArea();
    }

    @Override
    public void resize(double percent) {
        this.width = percent*this.width/100;
        this.height = percent*this.height/100;
    }
}