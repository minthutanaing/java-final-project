import java.util.Scanner; 

public class MealService {
    Scanner scanner = new Scanner(System.in);

    public void dinnerService() {
        Dinner normalDP = new NormalDietPlan();
        Dinner seafoodDP = new HalalDietPlan();

        System.out.println("\n======================== Meal Service ========================");
        System.out.println("Our Hotel will serve free Buffet Breakfast from 9-12. " + "\nBut you have to book dinner." );
        
        int yornchoice = -1;
        
        while (yornchoice != 1 && yornchoice != 2){
            System.out.print("Do you want to order dinner?" + "\n1. Yes" + "\n2. No" + "\nEnter 1 or 2...");
            yornchoice = scanner.nextInt();
            if (yornchoice == 1){
                //please make choices in here
                System.out.print("\nChoose your diet plan:" + "\n1) Normal diet" + "\n2) Halal");
                System.out.print("\nEnter 1, 2 or 3...");
                int dietchoice = -1; 
                dietchoice = scanner.nextInt();
                System.out.println(); 
                if (dietchoice == 1){
                    normalDP.displayNormalDietMenu();
                    normalDP.chooseADish(); 
                }
                else if (dietchoice == 2){
                    seafoodDP.displayHalalDietMenu();
                    seafoodDP.chooseADish(); 
                }
                else {
                    System.out.println("\nPlease only select 1 or 2!");
                }
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
