package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String Producer;

    public Product() {
    }

    public Product(int id, String name, int price, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }
}
