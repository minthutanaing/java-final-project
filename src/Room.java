import java.util.*;

public class Room {
    protected String roomType; 
    protected int numRoom; 
    protected Set<Integer> roomNumSet; 

    public Room (String roomType, int numRoom, Set<Integer> roomNumSet){
        this.roomType = roomType; 
        this.numRoom = numRoom; 
        this.roomNumSet = roomNumSet;

    }

    public String getRoomType() {return roomType;}
    public int getNumRoom() {return numRoom;}
    public Set<Integer> getRoomNumSet() {return roomNumSet;}
}
