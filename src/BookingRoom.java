import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookingRoom {
    Scanner sc = new Scanner(System.in);
    String userName;
    Long userContactNum;
    int durationOfStay;
    int userTotalRoom;
    int totalRoomPrice;

    public String getUserName(){return userName; }
    public Long getUserContactNum(){return userContactNum; }
    public int getDurationOfStay() {return durationOfStay; }
    public int getUserTotalRoom(){return userTotalRoom; }
    public int getTotalRoomPrice(){return totalRoomPrice; }

    public void start() {
        userPersonalInfo();
        bookRoom();
    }

    //asking for user personal information
    public void userPersonalInfo() {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("\n\nWelcome to Rose Hotel.");
                System.out.print("Please enter your name: ");
                userName = sc.nextLine();
                System.out.print("Please enter your phone number: ");
                userContactNum = sc.nextLong();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please fill in the correct infos.");
                sc.nextLine();
            }
        }
    }

    //booking rooms
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

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("\nOur Hotel Check-in and check-out time is from 12 pm to the next day 12 pm. ");
                System.out.print("How long will you be staying?" + "\nEnter duration (in days); ");
                durationOfStay = sc.nextInt();
                System.out.print("Enter total numbers of rooms you want: ");
                userTotalRoom = sc.nextInt();
                totalRoomPrice = 0;
                for (int i = 1; i <= userTotalRoom; i++ ){
                    System.out.print("\nChoose " + i + " room type: " + "\n1) single (500 Baht)" + "\n2) double (1000 Baht)" + "\n3) suite (5000 Baht) ");
                    System.out.println("\nEnter 1, 2 or 3 ...");
                    int roomType = sc.nextInt();
                    String roomTypeName = "";
                    int roomPrice = 0;
                    if(roomType == 1){
                        roomTypeName = "Single";
                        roomPrice = 500;
                    } else if(roomType == 2){
                        roomTypeName = "Double";
                        roomPrice = 1000;
                    } else if(roomType == 3){
                        roomTypeName = "Suite";
                        roomPrice = 5000;
                    }
                    boolean roomFound = false;
                    for (Room room : rooms) {
                        if(room.getRoomType().equals(roomTypeName) && room.getRoomAvailability()){
                            room.setAvailability(false);
                            System.out.print("Room booked. Room number: " + room.getRoomNum());
                            roomFound = true;
                            break;
                        }
                    }
                    if(!roomFound){
                        System.out.println("Sorry, no available rooms of this type.");
                    }
                    else {
                        totalRoomPrice += roomPrice * durationOfStay;
                    }
                }
                System.out.println("\nTotal room price: " + totalRoomPrice);
                validInput = true;
            }
            catch (InputMismatchException e){
                System.out.println("Error: Please fill in the correct infos.");
                sc.nextLine();
            }
        }

    }
}
