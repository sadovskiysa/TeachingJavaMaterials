/**
 * Created by cu on 11.12.2014.
 */
public class Doctor extends Person {
    private Patient[] patients = new Patient[10];

    public void heal(Patient patient){
        Patient currentPatient = null;
        for (int i = 0; i <patients.length; i++) {
            if(patients[i].equals(patient.name)) currentPatient = patient;
        }
        if(currentPatient==null)
            throw new IllegalArgumentException("Get out of me crazy retard it is not a mine cow");

        if(currentPatient.getIllness()==null){
            createDiagnose(currentPatient);
        } else {
            giveThePills(currentPatient);
        }
    }

    private void giveThePills(Patient patient) {
        System.out.println("Giving a pill");
    }

    private void createDiagnose(Patient patient) {
        if(patient.getAge()>50)
            patient.setIllness("Plague, heart-attack");
        else
            patient.setIllness("Plague");
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}
