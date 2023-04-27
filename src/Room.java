import java.util.HashMap;

public class Room extends Hotel{
    public Room (String name, String address){
        super(name, address);
    }
    
    public boolean isRoomAvailable(String roomType, int numRooms){
        HashMap<String, Integer> rooms = getRooms(); 
        if (rooms.containsKey(roomType) && rooms.get(roomType) >= numRooms){
            return true; 
        }
        else {
            return false; 
        }
    }
}
