import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        Hotel rRoom = new Room ("Koala Hotel", "ffff");

        HashMap<String, Integer> rooms = rRoom.getRooms(); 
        rooms.put("Single rooms", 2); 
        rooms.put("Double rooms", 1); 
        rooms.put("Family rooms", 3);
        
        System.out.println(); 
    
    }
    
}
