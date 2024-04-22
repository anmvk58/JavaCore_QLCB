package entity;

public class KySu extends CanBo{
    private String major;

    public KySu(String fullName, int age, Gender gender, String address, String major) {
        super(fullName, age, gender, address);
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }

    public void kySuQuanLy(){
        System.out.println(super.getFullName() + " quản lý dây chuyền sản xuất");
    }
}
