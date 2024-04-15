package entity;

public class KySu extends CanBo{
    private String major;

    public KySu(String fullName, int age, Gender gender, String address, String major) {
        super(fullName, age, gender, address);
        this.major = major;
    }
}
