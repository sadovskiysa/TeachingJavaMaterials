/**
 * Created by cu on 11.12.2014.
 */
public class Patient extends Person {
    private String illness;
    private Doctor doctor;

    public Patient(String name, int age, Gender gender, String illness, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
        this.doctor = doctor;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
