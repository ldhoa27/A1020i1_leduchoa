package case_study_.Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber,
                    String email, String typeCustomer, String address, Services services) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }


    public String showInfo() {
        return "Customer[" +
                "Name:" + name +
                ", Birthday: " + birthday +
                ", Gender: " + gender +
                ", IdCard: " + idCard +
                ", PhoneNumber: " + phoneNumber +
                ", Email: " + email +
                ", TypeCustomer: " + typeCustomer +
                ", Address: " + address +
                ", Services: " + services +
                ']';
    }

    @Override
    public String toString() {
        return getName() + "," + getBirthday() + "," + getGender() + "," + getIdCard() + "," + getPhoneNumber() + "," +
                getEmail() + "," + getTypeCustomer() + "," + getAddress() + "," + getServices();
    }
}
