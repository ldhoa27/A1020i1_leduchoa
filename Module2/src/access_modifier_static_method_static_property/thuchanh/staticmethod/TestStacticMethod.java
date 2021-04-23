package access_modifier_static_method_static_property.thuchanh.staticmethod;

public class TestStacticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Linh");
        Student student2 = new Student(2,"Hoang");
        Student student3 = new Student(3,"Manh");

        Student.change();

        student1.display();
        student2.display();
        student3.display();
    }
}
