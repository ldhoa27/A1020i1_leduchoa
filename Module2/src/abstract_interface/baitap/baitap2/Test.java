package abstract_interface.baitap.baitap2;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[1] = new Circle(1.2);
        shapes[0] = new Square(2.0);

        for (Shape shape : shapes){
            System.out.println(shape.toString());
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}