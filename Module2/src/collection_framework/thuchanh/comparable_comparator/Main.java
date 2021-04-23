package collection_framework.thuchanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nam", 30, "NA");
        Student student1 = new Student("Anh", 40, "HN");
        Student student2 = new Student("Ha", 38, "NA");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        Collections.sort(lists);
        for( Student st : lists);
        System.out.println(student.toString());
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
