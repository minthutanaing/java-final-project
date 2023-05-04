
public class HotelApp {
    public static void main (String[] args){
        BookingRoom hotel = new BookingRoom();
        hotel.start();
        MealService ms = new MealService();
        ms.dinnerService();
    }
    
}
