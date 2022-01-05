package model;

public class Doctor extends User {
    private int id;
    private String speciality;

    public Doctor(String name, String email, String address, String phoneNumber, String speciality) {
        super(name, email, address, phoneNumber);
        this.speciality = speciality;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return this.speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
         
    }
}
