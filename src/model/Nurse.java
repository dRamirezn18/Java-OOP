package model;

public class Nurse extends User{
    private String speciality;
    
    public Nurse(String speciality, String name, String email, String address, String phoneNumber) {
        super(name, email, address, phoneNumber);
        this.speciality = speciality;
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
