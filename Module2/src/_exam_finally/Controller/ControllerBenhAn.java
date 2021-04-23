package _exam_finally.Controller;


import _exam_finally.Common.FuncFileCSV;
import _exam_finally.Common.Regex;
import _exam_finally.Model.BenhAn;
import _exam_finally.Model.BenhAnThuong;
import _exam_finally.Model.BenhAnVip;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBenhAn {
    static  Scanner input = new Scanner(System.in);
    static ArrayList<BenhAn> benhanList = new ArrayList<>();
    static ArrayList<BenhAnThuong> benhanthuongList = new ArrayList<>();
    static ArrayList<BenhAnVip> benhanvipList = new ArrayList<>();

    public static void displayMainMenu(){
        System.out.println("MAIN MENU");
        System.out.println("1. Add Bệnh Án");
        System.out.println("2. Show all Bệnh Án");
        System.out.println("3. Delete Phương Tiện");
        System.out.println("4. Exit");
        System.out.println("----------------");
        System.out.print("Your choose: ");
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                addNewBenhAn();
                break;
            case "2":
                showAllBenhAn();
                break;
            case "3":
                deleteBenhAn();
                break;
            case "4": {
                System.out.println("Goodbye");
                System.exit(0);
                break;
            }
            default:
                System.out.println("Error. Please select menu.");
                input.nextLine();
                displayMainMenu();

        }
    }

    private static void showAllBenhAn() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. show Bệnh Án Thường");
            System.out.println("2. show Bệnh Án Vip");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            System.out.println("----------------");
            System.out.print("Your choose: ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    showBenhAnThuong();
                    break;
                case "2":
                    showBenhAnVip();
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
                    showAllBenhAn();
            }

    }

    private static void showBenhAnVip() {
        for (BenhAn benhanvip : benhanvipList){
            System.out.println(benhanvip.showInfo());
        }
        showAllBenhAn();
    }

    private static void showBenhAnThuong() {
        for (BenhAn benhanthuong : benhanthuongList){
            System.out.println(benhanthuong.showInfo());
        }
        showAllBenhAn();
    }

    private static void deleteBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Xóa Bệnh Án Thường");
        System.out.println("2. Xóa Bệnh Án Vip");
        System.out.println("3. Exit");
        System.out.print("Your choose: ");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                xoaBenhAnThuong();
                break;
            case "2":
                xoaBenhAnVip();
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
                deleteBenhAn();

        }
    }

    private static void xoaBenhAnVip() {
        System.out.println("nhập mã bệnh án cần xóa");
        String maBA = input.nextLine();
        for(int i =0;i<benhanvipList.size();i++){
            if(benhanvipList.get(i).getMaBA().equals(maBA)){
                System.out.println("Co san pham");
                System.out.println("yes or no");
                String option = input.nextLine();
                if(option.equals("yes")){
                    benhanvipList.remove(i);
                    showBenhAnVip();
                }
            }
        }
    }

    private static void xoaBenhAnThuong() {
        System.out.println("nhập mã bệnh án cần xóa");
        String maBA = input.nextLine();
        for(int i =0;i<benhanthuongList.size();i++){
            if(benhanthuongList.get(i).getMaBA().equals(maBA)){
                System.out.println("Co san pham");
                System.out.println("yes or no");
                String option = input.nextLine();
                if(option.equals("yes")){
                    benhanthuongList.remove(i);
                    showBenhAnThuong();
                }
            }
        }
    }


    private static void addNewBenhAn() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm Bệnh Án Thường");
            System.out.println("2. Thêm Bệnh Án Vip");
            System.out.println("3. Back to menu");
            System.out.println("4. Exit");
            System.out.print("Your choose: ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    themBenhAnThuong();
                    break;
                case "2":
                    themBenhAnVip();
                    break;
                case "3":
                    displayMainMenu();
                    break;

                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lỗi!!!!");
                    input.nextLine();
                    addNewBenhAn();

            }
        }

    private static void themBenhAnVip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm bệnh án VIP :\n");

        String idBA;
        do {
            System.out.println("Mời bạn nhập số thứ tự bênh án:");
            idBA = scanner.nextLine();
        }while (!Regex.checkIdBA(idBA));

        String maBA;
        do {
            System.out.println("Mời bạn nhập mã bệnh án:");
            maBA = scanner.nextLine();
        }while (!Regex.checkMaBA(maBA));

        String maBN;
        do {
            System.out.println("Mời bạn nhập mã bệnh nhân:");
            maBN = scanner.nextLine();
        }while (!Regex.checkMaBN(maBN));

        String tenBV;
        System.out.println("Mời bạn nhập tên Bệnh viện:");
        tenBV = scanner.nextLine();


        String ngayNV;
        do {
            System.out.println("Mời bạn nhập nhày nhập viện:");
            ngayNV = scanner.nextLine();
        }while (!Regex.checkNgayNV(ngayNV));

        String ngayRV;
        do {
            System.out.println("Mời bạn nhập ngày ra viện:");
            ngayRV = scanner.nextLine();
        }while (!Regex.checkNgayRV(ngayRV));

        String lydoNV;
        System.out.println("Mời bạn nhập lý do nhập viện:");
        lydoNV = scanner.nextLine();


        String loaiVip;
        do {
            System.out.println("Mời nhập loại Vip");
            loaiVip =scanner.nextLine();
        }while (!Regex.checkLoaiVip(loaiVip));

        String thoihanVip;
        do {
            System.out.println("Mời nhập thời hạn vip:");
            thoihanVip = scanner.nextLine();
        }while (!Regex.checkThoiHanVip(thoihanVip));

        BenhAnVip benhanvip = new BenhAnVip(idBA, maBA, maBN, tenBV, ngayNV, ngayRV, lydoNV, loaiVip, thoihanVip);
        benhanvipList.add(benhanvip);
        FuncFileCSV.writeBenhAnVip(benhanvipList);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        addNewBenhAn();
    }

    private static void themBenhAnThuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm bệnh án thường :\n");

        String idBA;
        do {
            System.out.println("Mời bạn nhập số thứ tự bênh án:");
            idBA = scanner.nextLine();
        }while (!Regex.checkIdBA(idBA));

        String maBA;
        do {
            System.out.println("Mời bạn nhập mã bệnh án:");
            maBA = scanner.nextLine();
        }while (!Regex.checkMaBA(maBA));

        String maBN;
        do {
            System.out.println("Mời bạn nhập mã bệnh nhân:");
            maBN = scanner.nextLine();
        }while (!Regex.checkMaBN(maBN));

        String tenBN;
        System.out.println("Mời bạn nhập tên Bệnh nhân:");
        tenBN = scanner.nextLine();


        String ngayNV;
        do {
            System.out.println("Mời bạn nhập nhày nhập viện:");
            ngayNV = scanner.nextLine();
        }while (!Regex.checkNgayNV(ngayNV));

        String ngayRV;
        do {
            System.out.println("Mời bạn nhập ngày ra viện:");
            ngayRV = scanner.nextLine();
        }while (!Regex.checkNgayRV(ngayRV));

        String lydoNV;
        System.out.println("Mời bạn nhập lý do nhập viện:");
        lydoNV = scanner.nextLine();


        String phiNV;
        do {
            System.out.println("Mời bạn nhập phí nằm viện:");
            phiNV = scanner.nextLine();
        }while (!Regex.checkPhiNamVien(phiNV));


        BenhAnThuong benhanthuong = new BenhAnThuong(idBA,maBA, maBN, tenBN, ngayNV, ngayRV, lydoNV, phiNV);
        benhanthuongList.add(benhanthuong);
        FuncFileCSV.writeBenhAnThuong(benhanthuongList);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        addNewBenhAn();

    }

    public static void main(String[] args) {
        benhanvipList = FuncFileCSV.readBenhAnVip();
        benhanthuongList = FuncFileCSV.readBenhAnThuong();
        displayMainMenu();
    }


}



