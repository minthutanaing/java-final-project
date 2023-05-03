import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HalalDietPlan extends Dinner{

    public HalalDietPlan() {
        super("Seafood Diet");
    }

    public void displayHalalDietMenu() {
        File file = new File ("src/halalfooddiet.txt");
        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " +  e.getMessage());
        }
    }
}
