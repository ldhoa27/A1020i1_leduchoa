package _exam_finally.Common;

public class Regex {
    private static String regex = "";
    public static boolean checkIdBA(String idBA){
        int id;
        try {
            id = Integer.parseInt(idBA);
            return id > 0;
        } catch (Exception ex) {
            return false;
        }
    }
    public static boolean checkMaBA(String maBA){
        String regex = "[B][A][-]\\d{3}";
        return maBA.matches(regex);
    }

    public static boolean checkMaBN(String maBN){
        String regex = "[B][N][-]\\d{3}";
        return maBN.matches(regex);
    }
    public static boolean checkNgayNV(String ngayNV){
        String regex = "^[\\d]{2}/[\\d]{2}/[\\d]{4}$";
        return ngayNV.matches(regex);
    }
    public static boolean checkNgayRV(String ngayRV){
        String regex = "^[\\d]{2}/[\\d]{2}/[\\d]{4}$";
        return ngayRV.matches(regex);
    }
    public static boolean checkLoaiVip(String loaiVip){
        regex = "(VIP I)|(VIP II)|(VIP III)";
        return loaiVip.matches(regex);
    }
    public static boolean checkThoiHanVip(String thoihanVip){
        String regex = "^[\\d]{2}/[\\d]{2}/[\\d]{4}$";
        return thoihanVip.matches(regex);
    }
    public static boolean checkPhiNamVien(String phi){
        double phiNV;
        try {
            phiNV = Double.parseDouble(phi);
            return phiNV > 1000;
        } catch (Exception Ex) {
            return false;
        }
    }
}
