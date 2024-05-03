package L1S2.Project;


public abstract class room { 
    //variables 
    private double roomSize; 
    private boolean reserved; 
     
    //getters 
    public double getroomSize() { 
        return roomSize; 
    } 
    public boolean isReserved() { 
        return reserved; 
    } 
     
    //setters 
    public void setroomSize(double roomSize) { 
    this.roomSize=roomSize; 
    } 
    public void setReserved(boolean reserved ) { 
    this.reserved=reserved; 
    } 
    public abstract String getRoomType(); 
}