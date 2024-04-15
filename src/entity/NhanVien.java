package entity;

public class NhanVien extends CanBo{
    private String task;

    public NhanVien(String fullName, int age, Gender gender, String address, String task) {
        super(fullName, age, gender, address);
        this.task = task;
    }
}
