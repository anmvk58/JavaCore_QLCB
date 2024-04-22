package backend;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB2 {
    private ArrayList<CanBo> listCanBo;
    private Scanner scanner;

    public QLCB2() {
        scanner = new Scanner(System.in);
        listCanBo = new ArrayList<>();
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
        listCanBo.add(congNhan);
        System.out.println("Thêm mới công nhân thành công");
    }

    private void themMoiKySu() {
        // BrSE2305 action
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
        System.out.println("Mời nhập tên chuyên ngành");
        String inputMajor = scanner.nextLine();
        KySu kySu = new KySu(inputName, inputAge, inputGender, inputAddress, inputMajor);
        listCanBo.add(kySu);
    }

    private void themMoiNhanVien() {
        // BrSE2305 action
        scanner.nextLine();
        System.out.println("Mời nhập họ tên nhân viên: ");
        String inputName = scanner.nextLine();
        System.out.println("Mời nhập tuổi nhân viên: ");
        int inputAge = scanner.nextInt();
        System.out.println("Mời nhập giới tính của nhân viên: ");
        System.out.println("1 = Nam  | 2 = Nữ  |  3 = Khác");
        int choiceGender = scanner.nextInt();
        Gender inputGender = Gender.KHAC;
        switch (choiceGender){
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
        System.out.println("Mời nhập địa chỉ của nhân viên: ");
        scanner.nextLine();
        String inputAddress = scanner.nextLine();
        System.out.println("Mời nhập thông tin công việc: ");
        String inputTask = scanner.nextLine();

        NhanVien nhanVien = new NhanVien(inputName, inputAge, inputGender, inputAddress, inputTask);
        listCanBo.add(nhanVien);
        System.out.println("Thêm mới thành công");
    }

    private void inDanhSachCanBo() {
        System.out.println("Danh sách Cán bộ là: ");
        for (CanBo canBo : listCanBo) {
            if(canBo instanceof CongNhan){
                CongNhan congNhan = (CongNhan) canBo;
                congNhan.sanXuatHangHoa();
            } else if (canBo instanceof  KySu){
                KySu kySu = (KySu) canBo;
                kySu.kySuQuanLy();
            } else if (canBo instanceof NhanVien) {
                NhanVien nhanVien = (NhanVien) canBo;
                nhanVien.nhanVienLamViec();
            }
        }
    }

    private void timKiemNhanVien(){
        // BrSE2305 action
        // search google: find an element in arraylist by value
        scanner.nextLine();
        System.out.println("Mời nhập tên cần tìm: ");
        String inputName = scanner.nextLine();
        boolean isFindOk = false;

        for (CanBo canbo : listCanBo){
            if (canbo.getFullName().equals(inputName)){
                System.out.println("Đã tìm thấy kết quả: ");
                isFindOk = true;
                System.out.println(canbo);
            }
        }

        if (!isFindOk) {
            System.out.println("Không tìm được kết quả");
        }
    }

    private void xoaCanBo() {
        // BrSE2305 action
        // Xóa dựa vào tên: (search google) remove an element from arraylist depend on value
        scanner.nextLine();
        System.out.println("Mời nhập tên cần xóa: ");
        String inputName = scanner.nextLine();

        boolean isDeleteOke = listCanBo.removeIf(s -> s.getFullName().equals(inputName));
        if (isDeleteOke){
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không xóa được: không tồn tại nhân viên với tên vừa nhập");
        }
    }

}
