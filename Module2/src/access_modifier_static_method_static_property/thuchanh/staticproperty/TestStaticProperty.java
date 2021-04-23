package access_modifier_static_method_static_property.thuchanh.staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Audi1", "lambogini9");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Audi2", "lambogini8");
        System.out.println(Car.numberOfCars);
    }
}
