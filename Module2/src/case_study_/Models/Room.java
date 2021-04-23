package case_study_.Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, String area, String price,  String typeRents, String freeService) {
        super(id, name, area, price, typeRents);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "Room[ Name: " + getName() +
                ", ID: " + getId() +
                ", Area: " + getArea() +
                ", Price: " + getPrice() +
                ", TypeRent: " + getTypeRents() +
                ", FreeService: " + getFreeService() +
                ']';
    }

    @Override
    public String toString() {
        return getName() + "," + getId() + "," + getArea() + "," + getPrice() + "," +
                getTypeRents() + "," + freeService;
    }
}
