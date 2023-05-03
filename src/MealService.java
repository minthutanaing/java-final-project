import java.util.Scanner; 

public class MealService {
    Scanner scanner = new Scanner(System.in);

    public void dinnerService() {
        Dinner normalDP = new NormalDietPlan();
        Dinner seafoodDP = new HalalDietPlan();

        System.out.println("======================== Meal Service ========================");
        System.out.println("Our Hotel will serve free Buffet Breakfast from 9-12. " + "\nBut you have to book dinner." );
        
        int yornchoice = -1;
        
        while (yornchoice != 1 && yornchoice != 2){
            System.out.print("\nDo you want to order dinner?" + "\n1. Yes" + "\n2. No" + "\nEnter 1 or 2...");
            yornchoice = scanner.nextInt();
            if (yornchoice == 1){
                //please make choices in here
                System.out.println("Choose your diet plan:" + "\n1) Normal diet" + "\n2) Halal");
                int dietchoice = -1; 
                dietchoice = scanner.nextInt();
                if (dietchoice == 1){
                    normalDP.displayNormalDietMenu();
                    normalDP.chooseADish(); 
                }
                else if (dietchoice == 2){
                    seafoodDP.displayHalalDietMenu();
                    seafoodDP.chooseADish(); 
                }
                else {
                    System.out.println("\nPlease only type 1 or 2!");
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
