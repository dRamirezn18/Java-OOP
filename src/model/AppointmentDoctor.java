package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor, Date date, String time) {
        this.patient = patient;
        this.doctor = doctor;
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

    public Doctor getDoctor() {
        return this.doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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
