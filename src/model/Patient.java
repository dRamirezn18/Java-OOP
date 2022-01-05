package model;

public class Patient extends User{
    private int id;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email, String address, String phoneNumber, double weight, double height, String blood) {
        super(name, email, address, phoneNumber);
        this.weight = weight;
        this.height = height;
        this.blood = blood;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return this.birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    } 
    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return this.blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        
    }
}
