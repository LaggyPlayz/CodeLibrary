package L1S2.Project;

public class ICU extends room 
{ 
    private boolean roomReady; 
    public String getRoomType()  {
    return "Critical operating room";
    }
    public boolean isRoomReadyToUse() { 
        return roomReady; 
    }
    //setters 
    public void SetRoomReadyToUse(boolean roomReady) { 
        this.roomReady=roomReady; 
    } 
} 
