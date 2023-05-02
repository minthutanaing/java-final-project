import java.io.*; 
import java.util.Scanner;

public class NormalDietPlan extends Dinner{
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

    public void chooseADish() { 
        int choice = -1; 
        while (!(choice < 0 && choice > 11)){
            System.out.println("Enter 1 to 10");
            switch (choice){
                case 0: 
                break; 
                case 1:
                System.out.println("+ Pad Thai");
                break;
                case 2:
                System.out.println("+ Pad Thai");
                break;
                case 3:
                System.out.println("+ Pad Thai");
                break;
                case 4:
                System.out.println("+ Pad Thai");
                break;
                case 5:
                System.out.println("+ Pad Thai");
                break;
                case 6:
                System.out.println("+ Pad Thai");
                break;
                case 7:
                System.out.println("+ Pad Thai");
                break;
                case 8:
                System.out.println("+ Pad Thai");
                break;
                case 9:
                System.out.println("+ Pad Thai");
                break;
                case 10:
                System.out.println("+ Pad Thai");
                break;
                default:
                System.out.println("Enter 1 to 10!");
                break;
            }
        }
    }
}
