package L1S2.Project;

public class Pacient extends Person{
    // Field Variables
    private String medicalHistory;
    private long hospitalFees;
    
    //Constructors
    public Pacient(String name , int age , long id , String address) {
        setName(name);
        setAge(age);
        setId(id);
        setAddress(address);
        hospitalFees = 100;
    }

    // Accessors
    public String getMedHistory() {
        return medicalHistory;
    }

    // Mutators
    public void setMedHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Functions
    public void doSurgery() {
        hospitalFees += 1500;
    }

    public void doctorSession() {
        hospitalFees += 150;
    }

}
