package entity;

//Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
public abstract class CanBo {
    private String fullName;
    private int age;
    private Gender gender;
    private String address;

    public CanBo(String fullName, int age, Gender gender, String address) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}
