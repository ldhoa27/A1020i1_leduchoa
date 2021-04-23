package abstract_interface.baitap.baitap1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.resize(50);
                System.out.println(resizeable.toString());
            }

            if (shape instanceof Rectangle){
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize(10);
                System.out.println(resizeable.toString());
            }

            if (shape instanceof Square){
                Resizeable resizeable = (Square) shape;
                resizeable.resize(120);
                System.out.println(resizeable.toString());
            }
        }
    }
}
