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
        
        System.out.print("Enter number of single rooms needed: ");
        int numSingleRooms = scanner.nextInt();
        if (((Room) rRoom).isRoomAvailable("Single", numSingleRooms)) {
            System.out.println(numSingleRooms + " single rooms are available.");
        } else {
            System.out.println("Sorry, not enough single rooms available.");
        }
        
        System.out.print("Enter number of double rooms needed: ");
        int numDoubleRooms = scanner.nextInt();
        if (((Room) rRoom).isRoomAvailable("Double", numDoubleRooms)) {
            System.out.println(numDoubleRooms + " double rooms are available.");
        } else {
            System.out.println("Sorry, not enough double rooms available.");
        }
        
        scanner.close(); 
    
    }
    
}
