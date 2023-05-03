import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookingRoom {
    Scanner sc = new Scanner(System.in);

    public void start() {
        BookingRoom bkRoom = new BookingRoom();
        bkRoom.userPersonalInfo();
        bkRoom.bookRoom();
    }

    public void userPersonalInfo() {
        try {
            System.out.println("Welcome to Rose Hotel.");
            System.out.println("Please enter your name: ");
            String userName = sc.nextLine();
            System.out.println("Please enter your phone number: ");
            String userContactNum = sc.nextLine();
        }
        catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void bookRoom(){
        ArrayList<Room> rooms = new ArrayList<>(); 

        //room structure 
        //for 1st floor
        for (int i = 101; i <= 120; i++){
            Room room = new Room ("Single", i);
            rooms.add(room);
        }
        for (int i = 121; i <= 141; i++){
            Room room = new Room ("Double", i);
            rooms.add(room);
        }
        for (int i = 142; i <= 152; i++){
            Room room = new Room ("Suite", i);
            rooms.add(room);
        }
        //for 2nd floor 
        for (int i = 201; i <= 216; i++){
            Room room = new Room ("Single", i);
            rooms.add(room);
        }
        for (int i = 217; i <= 232; i++){
            Room room = new Room ("Double", i);
            rooms.add(room);
        }
        for (int i = 233; i <= 248; i++){
            Room room = new Room ("Suite", i);
            rooms.add(room);
        }
        //for 3rd floor
        for (int i = 301; i <= 325; i++){
            Room room = new Room ("Single", i);
            rooms.add(room);
        }
         for (int i = 326; i <= 341; i++){
            Room room = new Room ("Double", i);
            rooms.add(room);
        }
        for (int i = 342; i <= 352; i++){
            Room room = new Room ("Suite", i);
            rooms.add(room);
        }

        try {
            System.out.println("\nOur Hotel Check-in and check-out time is from 12 pm to the next day 12 pm. ");
            System.out.println("\nHow long will you be staying?" + "\nEnter duration (in days); ");
            int durationOfStay = sc.nextInt();
            System.out.println("\nEnter total numbers of rooms you want: ");
            int userTotalRoom = sc.nextInt();
            for (int i = 1; i <= userTotalRoom; i++ ){
                System.out.print("Choose " + i + " room type: " + "\n1) single" + "\n2)double" + "\n3)suite");
                int roomType = sc.nextInt();
            }
            
            /*for (Room room : rooms) {
                System.out.println(room.getRoomNum());
            }*/
        }
        catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        // Check availability of rooms of the chosen type

    }

}
