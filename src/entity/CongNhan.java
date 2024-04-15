package entity;

public class CongNhan extends CanBo{
    private int level;

    public CongNhan(String fullName, int age, Gender gender, String address, int level) {
        super(fullName, age, gender, address);
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name=" + super.getFullName() + "; " +
                "age=" + super.getAge() + "; " +
                "gender=" + super.getGender() + "; " +
                "address=" + super.getAddress() + "; " +
                "level=" + level +
                '}';
    }
}
