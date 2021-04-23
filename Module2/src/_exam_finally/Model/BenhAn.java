package _exam_finally.Model;

public abstract class BenhAn {
    private String idBA;
    private String maBA;
    private String maBN;
    private String tenBN;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lydoNV;

    public BenhAn() {
    }

    public BenhAn(String idBA, String maBA, String maBN, String tenBN, String ngayNhapVien, String ngayRaVien, String lydoNV) {
        this.idBA = idBA;
        this.maBA = maBA;
        this.tenBN = tenBN;
        this.maBN = maBN;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lydoNV = lydoNV;
    }

    public String getIdBA() {
        return idBA;
    }

    public void setIdBA(String idBA) {
        this.idBA = idBA;
    }

    public String getMaBA() {
        return maBA;
    }

    public void setMaBA(String maBA) {
        this.maBA = maBA;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTenBN() {
        return tenBN;
    }

    public void setTenBN(String tenBN) {
        this.tenBN = tenBN;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLydoNV() {
        return lydoNV;
    }

    public void setLydoNV(String lydoNV) {
        this.lydoNV = lydoNV;
    }

    public abstract String showInfo();
}
