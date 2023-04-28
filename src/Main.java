import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        Hotel myHotel = new Hotel("Lovely Burma Hotel", "hell");
        System.out.println("Welcome to our " + myHotel.getName() + "!");
        System.out.println("Our Hotel is located in " + myHotel.getAddress() + "!");
        //System.out.print("Enter your name: " + sc.nextLine());
        
        SingleRoom singleRoom = new SingleRoom(null, 0, null);
        System.out.println(singleRoom.getRoomType()); 
        System.out.println(singleRoom.getNumRoom()); 
        for (Integer roomNum : singleRoom.getRoomNumSet()) {
            System.out.printf("%03d\n", roomNum);
        } 

    }
}
