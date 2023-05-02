import java.util.Scanner; 

public class MainApp {
    Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        Hotel hotel = new Hotel();
        //hotel.start();
        MealService ms = new MealService();
        ms.dinnerService();
    }
}
