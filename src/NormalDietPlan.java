import java.io.*; 
import java.util.Scanner;

public class NormalDietPlan extends Meal{
    public NormalDietPlan(){
        super("Normal Diet Menu");
    }

    public void displayNormalDietMenu() {
        File file = new File ("src/normaldiet.txt");
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
