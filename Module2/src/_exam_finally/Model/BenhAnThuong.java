package _exam_finally.Model;

public class BenhAnThuong extends BenhAn{
    private String phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(String idBA, String maBA, String maBN, String tenBN, String ngayNhapVien, String ngayRaVien, String lydoNV, String phiNamVien) {
        super(idBA, maBA, maBN, tenBN, ngayNhapVien, ngayRaVien, lydoNV);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return getIdBA() + "," + getMaBA() + "," + getTenBN() + "," + getNgayNhapVien() + "," + getNgayRaVien() + "," +getLydoNV()+ "," + getPhiNamVien() ;
    }
    @Override
    public String showInfo() {
        return "BenhAnThuong{so thu tu benh an :" + getIdBA() +
                ",ma benh an :" + getMaBA() +
                ", ma benh nhan:" + getMaBA()+
                ",ten benh nhan :" + getTenBN() +
                ",ngay nhap vien :" + getNgayNhapVien() +
                ",ngay ra vien :" + getNgayRaVien() +
                ",ly do nhap vien :" + getLydoNV()+
                ",phi nam vien :" + getPhiNamVien()+
                '}';
    }

}
