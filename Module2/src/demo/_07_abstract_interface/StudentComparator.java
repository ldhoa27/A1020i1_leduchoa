package _07_abstract_interface;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentCodeGym> {

    @Override
    public int compare(StudentCodeGym o1, StudentCodeGym o2) {
        if (o1.id > o2.id) {
            return 1;
        } else if (o1.id == o2.id) {
            return o1.name.compareTo(o2.name);
        } else {
            return -1;
        }
    }
}
