package L1S2.Project;

public class Employee extends Person{
    // Field Variables
    private long password;
    private double salary;

    // Constructors
    public Employee(String name , int age , long id , String address , long password) {
        setName(name);
        setAge(age);
        setId(id);
        setAddress(address);
        this.password = password;
    }

    // Accessors
    public double getSalary() {
        return salary;
    }

    // Mutators
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Functions
    @Override
    public String getJob() {
        return "Employee";
    }
}
