package L1S2.Project;

public class Manager extends Employee{
    // Field Variables
    private double bonus;

    // Constructors
    public Manager(String name , int age , long id , String address , long password) {
        super(name , age , id , address , password);
    }
    // Accessors
    public double getBonus() {
        return bonus;
    }

    // Mutators
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Functions
    public void calcSalary() {
        setSalary( getSalary() + bonus );               // Salary = Salary + bonus
    }

    @Override
    public String getJob() {
        return "Manager";
    }

}
