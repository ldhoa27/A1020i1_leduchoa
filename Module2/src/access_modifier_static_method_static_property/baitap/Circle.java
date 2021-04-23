package access_modifier_static_method_static_property.baitap;

public class Circle {
//    Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0, color (String) có giá trị khởi tạo là "red".
//    Hai hàm tạo: một không có tham số và một có tham số là radius.
//    Hai phương thức có access modifier là public: getRadius và getArea.
//    Hãy tạo lớp TestCircle, tạo đối tượng Circle và truy cập đến các phương thức getRadius() và getArea().
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public double getRadius(){

        return this.radius;
    }
    public double getArea(){

        return Math.pow(this.radius,2)*Math.PI;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
}
