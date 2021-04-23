package _exam_finally.Model;

public class BenhAnVip extends BenhAn{
    private String loaiVip;
    private String thoihanVip;

    public BenhAnVip() {
    }


    public BenhAnVip(String idBA, String maBA, String maBN, String tenBN, String ngayNhapVien, String ngayRaVien, String lydoNV, String loaiVip, String thoihanVip) {
        super(idBA, maBA, maBN, tenBN, ngayNhapVien, ngayRaVien, lydoNV);
        this.loaiVip = loaiVip;
        this.thoihanVip = thoihanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoihanVip() {
        return thoihanVip;
    }

    public void setThoihanVip(String thoihanVip) {
        this.thoihanVip = thoihanVip;
    }

    @Override
    public String toString() {
        return getIdBA() + "," + getMaBA() + "," + getTenBN() + "," + getNgayNhapVien() + "," + getNgayRaVien() + "," +getLydoNV()+ "," + getLoaiVip() + "," + getThoihanVip() ;

    }
    @Override
    public String showInfo() {
        return "BenhAnVip{so thu tu benh an :" + getIdBA() +
                ",ma benh an :" + getMaBA() +
                ", ma benh nhan:" + getMaBN()+
                ",ten benh nhan :" + getTenBN() +
                ",ngay nhap vien :" + getNgayNhapVien() +
                ",ngay ra vien :" + getNgayRaVien() +
                ",ly do nhap vien :" + getLydoNV()+
                ",loai Vip :" + getLoaiVip()+
                ",thoi han Vip :" + getThoihanVip()+
                '}';
    }


}
