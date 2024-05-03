package L1S2.Project;

public abstract class Person {
    // Field Variables
    private String name;
    private int age;
    private long id;
    private String address;            // asumming address will be entered correctly
    private String job;

    // Accessors
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public String getJob() {
        return job;
    }


    // Mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setAddress(String address) {
            this.address = address;
    }
    public void setJob(String job) {
        this.job = job;
    }

}
