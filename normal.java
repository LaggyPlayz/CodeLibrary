package L1S2.Project;

public class normal extends room { 
    //variable for beds's numbers 
    private int beds; 
    //getters 
    public double getBeds() { 
    return beds;
    }
    //setters 
    public void setBeds(int beds) 
    { 
    this.beds=beds; 
    } 
    public String getRoomType()  
    { 
    return "Normal Room"; 
    } 
}
