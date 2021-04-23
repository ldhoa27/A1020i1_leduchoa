package collection_framework.baitap;

import java.util.Comparator;

public class ComparatorProductByCost implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        if(o1.getCost() > o2.getCost()){
            return 1;
        } else if(o1.getCost() == o2.getCost()){
           return o1.getName().compareTo(o2.getName());
        } else {
            return -1;
        }
    }
}
