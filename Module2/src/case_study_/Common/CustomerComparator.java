package case_study_.Common;

import case_study_.Models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        int result = customer1.getName().compareTo(customer2.getName());
        if (result == 0) {
            return customer1.getBirthday().compareTo(customer2.getBirthday());
        } else {
            return result;
        }
    }
}