package _exam_finally.Common;


import _exam_finally.Model.BenhAnThuong;
import _exam_finally.Model.BenhAnVip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER_BENHANTHUONG = "idBA, maBA, maBN,tenBN, ngayNhapVien, ngayRaVien, lydoNV, phiNamVien";
    private static final String HEADER_BENHANVIP = "idBA, maBA, maBN, tenBN, ngayNhapVien,  ngayRaVien, lydoNV, loaiVip, thoihanVip";
    private static final String FILE_BENHAN = "D:\\A1020i1\\Module2\\src\\_exam_finally\\Data\\medical_records.csv";

    public static void writeBenhAnThuong(ArrayList<BenhAnThuong> listBenhAnThuong) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_BENHAN);
            fileWriter.append(HEADER_BENHANTHUONG);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (BenhAnThuong benhAnThuong : listBenhAnThuong) {
                fileWriter.append(benhAnThuong.getIdBA());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getMaBA());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getMaBN());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getTenBN());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getNgayNhapVien());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getNgayRaVien());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getLydoNV());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhAnThuong.getPhiNamVien());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CsvFileVillaWriter !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeBenhAnVip(ArrayList<BenhAnVip> listBenhAnVip) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_BENHAN);
            fileWriter.append(HEADER_BENHANVIP);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (BenhAnVip benhanvip : listBenhAnVip) {
                fileWriter.append(benhanvip.getIdBA());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getMaBA());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getMaBN());
                fileWriter.append(benhanvip.getTenBN());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getNgayNhapVien());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getNgayRaVien());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getLydoNV());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getLoaiVip());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(benhanvip.getThoihanVip());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CsvFileVillaWriter !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<BenhAnThuong> readBenhAnThuong() {
        BufferedReader br = null;
        ArrayList<BenhAnThuong> list = new ArrayList<BenhAnThuong>();
        Path path= Paths.get(FILE_BENHAN);
        if (!Files.exists(path)){
            try{
                Writer writer = new FileWriter(FILE_BENHAN);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_BENHAN));
            while ((line=br.readLine())!=null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("idBA")) {
                    continue;
                }
                BenhAnThuong benhanthuong = new BenhAnThuong();
                benhanthuong.setIdBA(splitData[0]);
                benhanthuong.setMaBA(splitData[1]);
                benhanthuong.setMaBN(splitData[2]);
                benhanthuong.setTenBN(splitData[3]);
                benhanthuong.setNgayNhapVien(splitData[4]);
                benhanthuong.setNgayRaVien(splitData[5]);
                benhanthuong.setLydoNV(splitData[6]);
                benhanthuong.setPhiNamVien(splitData[7]);
                list.add(benhanthuong);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    public static ArrayList<BenhAnVip> readBenhAnVip() {
        BufferedReader br = null;
        ArrayList<BenhAnVip> list = new ArrayList<BenhAnVip>();
        Path path= Paths.get(FILE_BENHAN);
        if (!Files.exists(path)){
            try{
                Writer writer = new FileWriter(FILE_BENHAN);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_BENHAN));
            while ((line=br.readLine())!=null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("idBA")) {
                    continue;
                }
                BenhAnVip benhanvip = new BenhAnVip();
                benhanvip.setIdBA(splitData[0]);
                benhanvip.setMaBA(splitData[1]);
                benhanvip.setMaBN(splitData[2]);
                benhanvip.setTenBN(splitData[3]);
                benhanvip.setNgayNhapVien(splitData[4]);
                benhanvip.setNgayRaVien(splitData[5]);
                benhanvip.setLydoNV(splitData[6]);
                benhanvip.setLoaiVip(splitData[7]);
                benhanvip.setThoihanVip(splitData[8]);
                list.add(benhanvip);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }




}
