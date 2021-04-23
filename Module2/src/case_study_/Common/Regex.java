package case_study_.Common;

public class Regex {
    private static String regex = "";

    public static boolean checkName(String str) {
        regex = "^[A-Z][a-z]*([\\s][A-Z][a-z])*$";
        return str.matches(regex);
    }

    public static boolean checkIDVilla(String id) {
        regex = "[S][V][V][L][-]\\d{4}";
        return id.matches(regex);
    }

    public static boolean checkIDHouse(String id) {
        regex = "[S][V][H][O][-]\\d{4}";
        return id.matches(regex);
    }

    public static boolean checkIDRoom(String id) {
        regex = "[S][V][R][O][-]\\d{4}";
        return id.matches(regex);
    }

    public static boolean checkArea(String area) {
        double areaNum;
        try {
            areaNum = Double.parseDouble(area);
            return areaNum > 10;
        } catch (Exception Ex) {
            return false;
        }
    }


    public static boolean checkPrice(String price) {
        double priceNum;
        try {
            priceNum = Double.parseDouble(price);
            return priceNum > 0;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean checkTypeRent(String typeRents) {
        regex = "(year)|(month)|(day)";
        return typeRents.matches(regex);
    }

    public static boolean checkFacilities(String facilities) {
        regex = "(massage)|(karaoke)|(food)|(drink)|(car)";
        return facilities.matches(regex);
    }

    public static boolean checkFloor(String floor) {
        int floorNum;
        try {
            floorNum = Integer.parseInt(floor);
            return floorNum > 0;
        } catch (Exception ex) {
            return false;
        }
    }
}
