package abstract_interface.baitap.baitap1;

public class Square extends Rectangle implements Resizeable {
    private double side;
    private String name = "Hinh Vuong";

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public void resize(double percent) {
        this.side = percent*this.side/100;
    }

    @Override
    public String toString() {
        return "Rectangle {"
                + "side : " + this.side
                + "} "
                + "Area :" + this.getArea();
    }
}
