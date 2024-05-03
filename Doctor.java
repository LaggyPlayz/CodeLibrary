package L1S2.Project;

public class Doctor extends Employee{
    // Field Variables
    private String specialization;
    private int surgeries;

    // Constructors
    public Doctor(String name , int age , long id , String address , long password , String specialization) {
        super(name, age, id, address, password);
        this.specialization = specialization;
    }

    // Accessors
    public String getSpecialization() {
        return specialization;
    }

    // Mutators
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Functions
    public void calcSalary() {
        setSalary( getSalary() + 1000*surgeries );             // Salary = Salary + SurgeryFee
    }
    
    @Override
    public String getJob() {
        return "Doctor";
    }
}
