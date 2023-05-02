import java.util.Scanner; 

public class MainApp {
    public static void main (String[] args){
        Hotel hotel = new Hotel();
        //hotel.start();
        MainApp main = new MainApp();
        main.askingForMealOption();
        Meal normalDP = new NormalDietPlan();
        normalDP.displayNormalDietMenu();
    }

    public void askingForMealOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("Our Hotel will serve free Buffet Breakfast from 9-12. " + "\nBut you have to book dinner." );
        
        int yornchoice = -1;
        
        while (yornchoice != 1 && yornchoice != 2){
            System.out.print("\nDo you want to order dinner?" + "\n1. Yes" + "\n2. No" + "\nEnter 1 or 2...");
            yornchoice = scanner.nextInt();
            if (yornchoice == 1){
                System.out.println("y choose");
            }
            else if (yornchoice == 2){
                System.out.println("Thanks!");
                return; 
            }
            else { 
                System.out.println("\nPlease only type 1 or 2!");
            }
        }
        
        
    }
}
