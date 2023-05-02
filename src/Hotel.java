import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    public void start() {
        Hotel app = new Hotel();
        app.bookRoom();
    }
    
    public void bookRoom(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>(); 

        for (int i = 1; i <= 30; i++){
            Room room = new Room ("Single", i);
            rooms.add(room);
        }
        for (int i = 31; i <= 50; i++){
            Room room = new Room ("Double", i);
            rooms.add(room);
        }
        for (int i = 51; i <= 55; i++){
            Room room = new Room ("Suite", i);
            rooms.add(room);
        }


        //System.out.println("These are the available lists of rooms.");
        displayRoomTypes();
        /*for (Room room: rooms){
            if (room.isRoomAvailable()){
                System.out.println(room.getRoomType() + " room " + room.getRoomNum());
            }
        }*/


        System.out.print("Enter room type (single/double/suite): ");
        String roomType = sc.nextLine();
        System.out.print("Enter duration of stay (in days): ");
        int duration = sc.nextInt();

        // Check availability of rooms of the chosen type
        boolean foundAvailableRoom = false;
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType) && room.isRoomAvailable()) {
                room.setAvailability(false);
                System.out.println("Room #" + room.getRoomNum() + " booked for " + duration + " days.");
                foundAvailableRoom = true;
                break;
            }
        }

        if (!foundAvailableRoom) {
            System.out.println("No available rooms of type " + roomType + ".");
        }
    }

    void displayRoomTypes(){
        System.out.println("Choose the type of room: \n1. Single room \n2. Double Room \n3. Suite ");
    }



}
