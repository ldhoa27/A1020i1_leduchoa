package case_study_.Common;


import case_study_.Models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FuncFileCSV {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER_VILLA = "Name,ID,AreaPrice,TypeRents,StandardRoom,AreaPool,Floor,OtherFacilities";
    private static final String HEADER_HOUSE = "Name,ID,AreaPrice,TypeRents,StandardRoom,Floor,OtherFacilities";
    private static final String HEADER_ROOM = "ID,Name,Area,Price,TypeRents,FreeService";
    private static final String HEADER_CUSTOMER = "Name,Birthday,Gender,IdCard,PhoneNumber,Email,TypeCustomer,Address,Services";
    private static final String FILE_VILLA = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\Villa.csv";
    private static final String FILE_HOUSE = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\House.csv";
    private static final String FILE_ROOM = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\Room.csv";
    private static final String FILE_CUSTOMER = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\Customer.csv";
    private static final String FILE_BOOKING = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\Booking.csv";
    private static final String FILE_EMPLOYEE = "D:\\A1020i1\\Module2\\src\\case_study_\\data\\Employee.csv";
    public static <T> void writeServices(List<T> list, String value) {
        FileWriter fileWriter = null;
        try {
            if (value.equals("villa")) {
                fileWriter = new FileWriter(FILE_VILLA);
                fileWriter.append(HEADER_VILLA); //viết tiêu đề
                fileWriter.append(NEW_LINE_SEPARATOR);
            } else if (value.equals("house")) {
                fileWriter = new FileWriter(FILE_HOUSE);
                fileWriter.append(HEADER_HOUSE);
                fileWriter.append(NEW_LINE_SEPARATOR);
            } else {
                fileWriter = new FileWriter(FILE_ROOM);
                fileWriter.append(HEADER_ROOM);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            for (T t : list) {   //ghi ds đối tượng vào file
                fileWriter.append(t.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("lỗi file");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("lỗi khi đóng");
            }
        }
    }

    public static List<Services> readServicesFileCSV(String value) {
        BufferedReader brReader = null;
        List<Services> list = new ArrayList<>();
        String filePath = null;

        switch (value) {
            case "villa":
                filePath = FILE_VILLA;
                break;
            case "house":
                filePath = FILE_HOUSE;
                break;
            case "room":
                filePath = FILE_ROOM;
                break;
        }

        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePath);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            brReader = new BufferedReader(new FileReader(filePath)); // đọc từng dòng
            String line;

            while ((line = brReader.readLine()) != null) {
                String[] splitData = line.split(",");
//                System.out.println(line);
                if (splitData[0].equals("Name")) {
                    continue;
                }
                switch (value) {
                    case "villa":
                        Villa villa = new Villa();
                        villa.setName(splitData[0]);
                        villa.setId(splitData[1]);
                        villa.setArea(splitData[2]);
                        villa.setPrice(splitData[3]);
                        villa.setTypeRents(splitData[4]);
                        villa.setStandardRoom(splitData[5]);
                        villa.setAreaPool(splitData[6]);
                        villa.setFloor(splitData[7]);
                        villa.setOtherFacilities(splitData[8]);
                        list.add(villa);
                        break;
                    case "house":
                        House house = new House();
                        house.setName(splitData[0]);
                        house.setId(splitData[1]);
                        house.setArea(splitData[2]);
                        house.setPrice(splitData[3]);
                        house.setTypeRents(splitData[4]);
                        house.setStandardRoom(splitData[5]);
                        house.setFloor(splitData[6]);
                        house.setOtherFacilities(splitData[7]);
                        list.add(house);
                        break;
                    case "room":
                        Room room = new Room();
                        room.setId(splitData[0]);
                        room.setName(splitData[1]);
                        room.setArea(splitData[2]);
                        room.setPrice(splitData[3]);
                        room.setTypeRents(splitData[4]);
                        room.setFreeService(splitData[5]);
                        list.add(room);
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println("lỗi đọc file");
        } finally {
            try {
                brReader.close();
            } catch (Exception ex) {
                System.out.println("lỗi đóng");
            }
        }
        return list;
    }

    public static void writeFileCustomer(List<Customer> listCustomer) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(FILE_CUSTOMER);
            fileWriter.append(HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Customer customer : listCustomer) {
                fileWriter.append(customer.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi file");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("ERROR ");
            }
        }
    }

    public static List<Customer> readFileCustomer(List<Services> servicesList, String servicesCode) {
        BufferedReader brReader = null;
        List<Customer> list = new ArrayList<>();
        Path path = Paths.get(FILE_CUSTOMER);

        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_CUSTOMER);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            brReader = new BufferedReader(new FileReader(FILE_CUSTOMER));
            String line;
            while ((line = brReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                String serviceID = splitData[8];
                if (serviceID.substring(0, 4).equals(servicesCode)) {
                    for (Services services : servicesList) {
                        if (services.getId().equals(serviceID)) {
                            customer.setServices(services);
                            list.add(customer);
                            break;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("");
        } finally {
            try {
                brReader.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;
    }

    public static void writeFileBookingToCSV(List<Customer> listBooking) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(FILE_BOOKING);
            fileWriter.append(HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Customer customer : listBooking) {
                fileWriter.append(customer.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi file");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public static Map<String, Employee> readFileEmployee() {
        BufferedReader brReader = null;
        Map<String, Employee> employeeMap = new LinkedHashMap<>();
        Path path = Paths.get(FILE_EMPLOYEE);

        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_EMPLOYEE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            brReader = new BufferedReader(new FileReader(FILE_EMPLOYEE));
            String line;
            while ((line = brReader.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("Name")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setName(splitdata[0]);
                employee.setAge(Integer.parseInt(splitdata[1]));
                employee.setAddress(splitdata[2]);
                String idEmployee = String.format("Thứ tự%d:", employeeMap.size() + 1);
                employeeMap.put(idEmployee, employee);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                brReader.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return employeeMap;

    }

}
