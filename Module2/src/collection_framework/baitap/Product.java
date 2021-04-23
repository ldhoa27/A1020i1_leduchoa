package collection_framework.baitap;

import java.util.Comparator;

public class Product{
    private String name;
    private int id;
    private float cost;
    public Product() {
    }
    public Product(String name, int id, float cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    void displayProduct(){
        System.out.println("Tên sản phẩm: "+name);
        System.out.println("id sản phẩm: "+id);
        System.out.println("giá sản phẩm: "+cost);
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }

}
