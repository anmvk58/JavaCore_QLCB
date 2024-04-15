package backend;

import entity.CongNhan;
import entity.Gender;
import entity.KySu;
import entity.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CongNhan> listCongNhan;
    private ArrayList<KySu> listKySu;
    private ArrayList<NhanVien> listNhanVien;
    private Scanner scanner;

    public QLCB() {
        scanner = new Scanner(System.in);
        listCongNhan = new ArrayList<>();
        listKySu = new ArrayList<>();
        listNhanVien = new ArrayList<>();
    }


    public void runQLCB() {
        while (true) {
            System.out.println("\n*********************");
            System.out.println("1 - Thêm mới cán bộ");
            System.out.println("2 - Tìm kiếm cán bộ");
            System.out.println("3 - In danh sách cán bộ");
            System.out.println("4 - Xóa cán bộ");
            System.out.println("5 - Thoát chương trình");
            System.out.println("*********************");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    themMoiCanBo();
                    break;
                case 2:
                    // gọi phương thức để tìm kiếm
                    timKiemNhanVien();
                    break;
                case 3:
                    // gọi phương thức để in danh sách cán bộ
                    inDanhSachCanBo();
                    break;
                case 4:
                    // gọi phương thức để xóa cán bộ
                    xoaCanBo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn đã nhập sai lựa chọn, vui lòng nhập từ 1 -> 5");
            }
        }
    }

    // Ham them moi can bo:
    public void themMoiCanBo() {
        // Hoi nguoi dung xem la nhap loai can bo nao ?
        System.out.println("Bạn muốn thêm loại cán bộ nào ?");
        System.out.println("1 - Công Nhân | 2 - Kỹ Sư | 3 - Nhân viên");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
//                thực hiện thêm mới công nhân
                System.out.println("-> Thêm mới công nhân");
                themMoiCongNhan();
                break;
            case 2:
//                thực hiện thêm mới Kỹ sư
                System.out.println("-> Thêm mới kỹ sư");
                themMoiKySu();
                break;
            case 3:
//                thực hiện thêm mới nhân viên
                System.out.println("-> Thêm mới nhân viên");
                themMoiNhanVien();
                break;
            default:
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại từ 1 -> 3");

        }
    }

    private void themMoiCongNhan() {
        scanner.nextLine();
        System.out.println("Mời nhập vào tên");
        String inputName = scanner.nextLine();
        System.out.println("Mời nhập tuổi");
        int inputAge = scanner.nextInt();
        System.out.println("Mời nhập Giới tính");
        System.out.println("1 - NAM | 2 - NỮ | 3 - KHÁC");
        int choiceGender = scanner.nextInt();
        Gender inputGender = Gender.KHAC;
        switch (choiceGender) {
            case 1:
                inputGender = Gender.NAM;
                break;
            case 2:
                inputGender = Gender.NU;
                break;
            case 3:
                inputGender = Gender.KHAC;
                break;
        }
        scanner.nextLine();
        System.out.println("Mời nhập địa chỉ");
        String inputAddress = scanner.nextLine();
        System.out.println("Mời nhập bậc của công nhân");
        int inputLevel = scanner.nextInt();
        CongNhan congNhan = new CongNhan(inputName, inputAge, inputGender, inputAddress, inputLevel);
        listCongNhan.add(congNhan);
        System.out.println("Thêm mới công nhân thành công");
    }

    private void themMoiKySu() {
        // BrSE2305 action
    }

    private void themMoiNhanVien() {
        // BrSE2305 action
    }

    private void inDanhSachCanBo() {
        System.out.println("Danh sách Công nhân là: ");
        for (CongNhan congNhan : listCongNhan) {
            System.out.println(congNhan);
        }
        System.out.println("\nDanh sách Kỹ sư là: ");
        for (KySu kySu : listKySu) {
            System.out.println(kySu);
        }
        System.out.println("\nDanh sách Nhân viên là: ");
        for (NhanVien nhanVien : listNhanVien){
            System.out.println(nhanVien);
        }
    }

    private void timKiemNhanVien(){
        // BrSE2305 action
        // search google: find an element in arraylist by value
    }

    private void xoaCanBo() {
        // BrSE2305 action
        // Xóa dựa vào tên: (search google) remove an element from arraylist depend on value
    }
}
