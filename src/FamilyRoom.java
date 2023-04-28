import java.util.*;
import java.io.*;


public class FamilyRoom extends Room {
    public FamilyRoom (String roomType, int numRoom, Set<Integer> roomNumSet){
        super(roomType, numRoom, roomNumSet);
        this.roomType = "Family rooms";
        this.numRoom = 10; 
        this.roomNumSet =  createRoomNumSet(); 
    }
    public Set<Integer> createRoomNumSet() {
        Set<Integer> roomNumSet = new HashSet<>();
        File roomslist = new File("src/familyRoomNumSet.txt");
        try (Scanner sc = new Scanner(roomslist)){
            while (sc.hasNextLine()){
                int roomNum = sc.nextInt();
                roomNumSet.add(roomNum);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        
        return roomNumSet;
    }

}
