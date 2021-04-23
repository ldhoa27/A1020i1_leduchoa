package case_study_.Controller;

import case_study_.Common.CustomerComparator;
import case_study_.Common.FuncFileCSV;
import case_study_.Common.Regex;
import case_study_.Exception.*;
import case_study_.Models.*;

import java.util.*;

public class MainController {
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<Customer>();
    static List<Services> villaList = new ArrayList<>();
    static List<Services> houseList = new ArrayList<>();
    static List<Services> roomList = new ArrayList<>();
    static List<Customer> bookingList = new ArrayList<>();
    static Set<String> nameVillaNotDuplicate = new TreeSet<>();
    static Set<String> nameHouseNotDuplicate = new TreeSet<>();
    static Set<String> nameRoomNotDuplicate = new TreeSet<>();
    static Map<String, Employee> employeeMap = new LinkedHashMap<>();

    public static void displayMainMenu() {
        System.out.println("MAIN MENU");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information Of Employee");
        System.out.println("7. Exit");
        System.out.println("----------------");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1":
                addNewServices();
                break;

            case "2":
                showServices();
                break;

            case "3":
                addNewCustomer();
                break;

            case "4":
                showCustomer();
                break;

            case "5":
                addNewBooking();
                break;

            case "6":
                showInformationOfEmployee();
                break;

            case "7":
                System.exit(0);
                break;

            default:
                System.out.println("Lỗi!!!!!!");
                input.nextLine();
                displayMainMenu();

        }
    }

    public static void addNewServices() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1":
                addNewVilla();
                break;

            case "2":
                addNewHouse();
                break;

            case "3":
                addNewRoom();
                break;

            case "4":
                displayMainMenu();
                break;

            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Lỗi!!!!");
                input.nextLine();
                addNewServices();

        }
    }

    public static void addNewVilla() {
        Villa villa = new Villa();

        String name;
        do {
            System.out.print("Nhập tên:");
            name = input.nextLine();
        } while (!Regex.checkName(name));
        villa.setName(name);

        String checkID;
        do {
            System.out.print("iD:");
            checkID = input.nextLine();
        } while (!Regex.checkIDVilla(checkID));
        villa.setId(checkID);

        String checkArea;
        do {
            System.out.print("Diện tích:");
            checkArea = input.nextLine();
        } while (!Regex.checkArea(checkArea));
        villa.setArea(checkArea);

        String checkPrice;
        do {
            System.out.print("Giá tiền thuê:");
            checkPrice = input.nextLine();
        } while (!Regex.checkPrice(checkPrice));
        villa.setPrice(checkPrice);

        String checkTypeRents;
        do {
            System.out.print("Kiểu thuê: ");
            checkTypeRents = input.nextLine();
        } while (!Regex.checkTypeRent(checkTypeRents));
        villa.setTypeRents(checkTypeRents);

        String standard;
        do {
            System.out.print("Loại phòng: ");
            standard = input.nextLine();
        } while (!Regex.checkName(standard));
        villa.setStandardRoom(standard);

        String checkAreaPool;
        do {
            System.out.print("Diện tích hồ bơi: ");
            checkAreaPool = input.nextLine();
        } while (!Regex.checkArea(checkAreaPool));
        villa.setAreaPool(checkAreaPool);

        String floor;
        do {
            System.out.print("Tầng: ");
            floor = input.nextLine();
        } while (!Regex.checkFloor(floor));
        villa.setFloor(floor);

        String facilities;
        do {
            System.out.print("Dịch vụ khác: ");
            facilities = input.nextLine();
        } while (!Regex.checkFacilities(facilities));
        villa.setOtherFacilities(facilities);

        villaList.add(villa);
        FuncFileCSV.writeServices(villaList, "villa");
        addNewServices();
    }

    public static void addNewHouse() {
        House house = new House();

        String name;
        do {
            System.out.print("Tên: ");
            name = input.nextLine();
        } while (!Regex.checkName(name));
        house.setName(name);

        String id;
        do {
            System.out.print("ID: ");
            id = input.nextLine();
        } while (!Regex.checkIDHouse(id));
        house.setId(id);

        String area;
        do {
            System.out.print("Diện tích: ");
            area = input.nextLine();
        } while (!Regex.checkArea(area));
        house.setArea(area);


        String price;
        do {
            System.out.print("Giá thuê : ");
            price = input.nextLine();
        } while (!Regex.checkPrice(price));
        house.setPrice(price);

        String typeRents;
        do {
            System.out.print("Kiểu thuê: ");
            typeRents = input.nextLine();
        } while (!Regex.checkTypeRent(typeRents));
        house.setTypeRents(typeRents);

        String standard;
        do {
            System.out.print("Loại phòng: ");
            standard = input.nextLine();
        } while (!Regex.checkName(standard));
        house.setStandardRoom(standard);

        String floor;
        do {
            System.out.print("Tầng: ");
            floor = input.nextLine();
        } while (!Regex.checkFloor(floor));
        house.setFloor(floor);

        String facilities;
        do {
            System.out.print("Dịch vụ khác: ");
            facilities = input.nextLine();
        } while (!Regex.checkFacilities(facilities));
        house.setOtherFacilities(facilities);

        houseList.add(house);
        FuncFileCSV.writeServices(houseList, "house");
        addNewServices();
    }

    public static void addNewRoom() {
        Room room = new Room();

        String name;
        do {
            System.out.print("Tên: ");
            name = input.nextLine();
        } while (!Regex.checkName(name));
        room.setName(name);

        String id;
        do {
            System.out.print("ID: ");
            id = input.nextLine();
        } while (!Regex.checkIDRoom(id));
        room.setId(id);

        String area;
        do {
            System.out.print("Diện tích: ");
            area = input.nextLine();
        } while (!Regex.checkArea(area));
        room.setArea(area);

        String price;
        do {
            System.out.print("Giá thuê: ");
            price = input.nextLine();
        } while (!Regex.checkPrice(price));
        room.setPrice(price);

        String typeRents;
        do {
            System.out.print("Kiểu thuê: ");
            typeRents = input.nextLine();
        } while (!Regex.checkTypeRent(typeRents));
        room.setTypeRents(typeRents);

        String facilities;
        do {
            System.out.print("Dịch vụ khác: ");
            facilities = input.nextLine();
        } while (!Regex.checkFacilities(facilities));
        room.setFreeService(facilities);

        roomList.add(room);
        FuncFileCSV.writeServices(roomList, "room");
        addNewServices();
    }

    public static void showServices() {
        System.out.println("SHOW SERVICES");
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Room Not Duplicate");
        System.out.println("7.Back To Menu");
        System.out.println("8.Exit");
        System.out.println("-------------");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showNameVilla();
                break;
            case "5":
                showNameHouse();
                break;
            case "6":
                showNameRoom();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default: {
                System.out.println("Lỗi. hãy nhập lại.");
                input.nextLine();
                showServices();
            }
        }
    }

    public static void showAllVilla() {
        for (Services villa : villaList) {
            System.out.println(villa.showInfo());
        }
        showServices();
    }

    public static void showAllHouse() {
        for (Services house : houseList) {
            System.out.println(house.showInfo());
        }
        showServices();
    }

    public static void showAllRoom() {
        for (Services room : roomList) {
            System.out.println(room.showInfo());
        }
        showServices();
    }

    public static void showNameVilla() {
        for (Services nameVilla : villaList) {
            nameVillaNotDuplicate.add(nameVilla.getName());
        }
        System.out.println(nameVillaNotDuplicate);
        displayMainMenu();
    }

    public static void showNameHouse() {
        for (Services nameHouse : houseList) {
            nameHouseNotDuplicate.add(nameHouse.getName());
        }
        System.out.println(nameHouseNotDuplicate);
        displayMainMenu();
    }

    public static void showNameRoom() {
        for (Services nameRoom : roomList) {
            nameRoomNotDuplicate.add(nameRoom.getName());
        }
        System.out.println(nameRoomNotDuplicate);
        displayMainMenu();
    }

    public static void addNewCustomer() {
        Customer customer = new Customer();

        String name;
        do {
            System.out.print("Tên khách hàng: ");
            name = input.nextLine();
        } while (!NameException.checkName(name));
        customer.setName(name);

        String birthday;
        do {
            System.out.print("Ngày sinh : ");
            birthday = input.nextLine();
        } while (!BirthdayException.checkBirthday(birthday));
        customer.setBirthday(birthday);

        String gender;
        do {
            System.out.print("Giới tính: ");
            gender = input.nextLine();
        } while (!GenderException.checkGender(gender));
        customer.setGender(gender);

        String id;
        do {
            System.out.print("IdCard: ");
            id = input.nextLine();
        } while (!IdCardException.checkID(id));
        customer.setIdCard(id);

        String number;
        do {
            System.out.print("Số điện thoại: ");
            number = input.nextLine();
        } while (!PhoneNumberException.checkPhoneNumber(number));
        customer.setPhoneNumber(number);

        String email;
        do {
            System.out.print("Email: ");
            email = input.nextLine();
        } while (!EmailException.checkEmail(email));
        customer.setEmail(email);

        System.out.print("Loại khách hàng: ");
        customer.setTypeCustomer(input.nextLine());
        System.out.print("Address: ");
        customer.setAddress(input.nextLine());


        customerList.add(customer);
        FuncFileCSV.writeFileCustomer(customerList);
        displayMainMenu();
    }

    public static void showCustomer() {
        Comparator<Customer> customerComparator = new CustomerComparator();
        Collections.sort(customerList, customerComparator);
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
        displayMainMenu();
    }

    public static void addNewBooking() {
        for (Customer customer : customerList) {
            System.out.println((customerList.indexOf(customer) + 1) + "." + (customer.showInfo()));
        }
        System.out.print("Enter customer: ");
        String choose = input.nextLine();
        int index = Integer.parseInt(choose) - 1;
        Customer customer = customerList.get(index);
        System.out.println(customer);

        System.out.println("1.Booking Villa");
        System.out.println("2.Booking House");
        System.out.println("3.Booking Room");
        System.out.print("Your Choose: ");
        String chooseBooking = input.nextLine();

        switch (chooseBooking) {
            case "1": {
                Services villa = selectServices(villaList);
                if (bookingList.contains(customer)) {
                    customer.setServices(villa);
                } else {
                    customer.setServices(villa);
                    bookingList.add(customer);
                }
                break;
            }
            case "2": {
                Services house = selectServices(houseList);
                if (bookingList.contains(customer)) {
                    customer.setServices(house);
                } else {
                    customer.setServices(house);
                    bookingList.add(customer);
                }
                break;
            }
            case "3": {
                Services room = selectServices(roomList);
                if (bookingList.contains(customer)) {
                    customer.setServices(room);
                } else {
                    customer.setServices(room);
                    bookingList.add(customer);
                }
                break;
            }
        }
        FuncFileCSV.writeFileCustomer(customerList);
        FuncFileCSV.writeFileBookingToCSV(bookingList);
        displayMainMenu();
    }

    public static Services selectServices(List<Services> list) {
        for (Services services : list) {
            System.out.println((list.indexOf(services) + 1) + "." + (services.showInfo()));
        }
        System.out.print("Enter services: ");
        String choose = input.nextLine();
        int index = Integer.parseInt(choose) - 1;
        Services services = list.get(index);
        return services;
    }
    public static void showInformationOfEmployee() {
         employeeMap = FuncFileCSV.readFileEmployee();
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        displayMainMenu();
    }


    public static void main(String[] args) {
        villaList = FuncFileCSV.readServicesFileCSV("villa");
        houseList = FuncFileCSV.readServicesFileCSV("house");
        roomList = FuncFileCSV.readServicesFileCSV("room");
        customerList = FuncFileCSV.readFileCustomer(villaList, "SVVL");
        customerList.addAll(FuncFileCSV.readFileCustomer(houseList, "SVHO"));
        customerList.addAll(FuncFileCSV.readFileCustomer(roomList, "SVRO"));
        bookingList.addAll(customerList);
        displayMainMenu();
    }
}
