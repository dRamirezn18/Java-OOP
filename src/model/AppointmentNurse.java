package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable{
    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    public AppointmentNurse(Patient patient, Nurse nurse, Date date, String time) {
        this.patient = patient;
        this.nurse = nurse;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return this.patient;
    } 
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getNurse() {
        return this.nurse;
    }
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Date getDate() {
        return this.date;
    } 
    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        
    }
}
