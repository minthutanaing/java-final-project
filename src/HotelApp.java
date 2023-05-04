import java.util.Scanner; 

public class HotelApp {
    
    Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        BookingRoom hotel = new BookingRoom();
        hotel.start();
        MealService ms = new MealService();
        ms.dinnerService();
    }
    
}
