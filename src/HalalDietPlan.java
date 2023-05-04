import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HalalDietPlan extends Dinner{
    Scanner scanner = new Scanner(System.in);

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

    public void chooseADish() { 
        ArrayList<String> chosenDishes = new ArrayList<>();
        int choice = -1; 
        foodPrice = 0; 
        while (choice != 0){
            System.out.println("Enter 1 to 10:");
            choice = scanner.nextInt(); 
            switch (choice){
                case 0: 
                    break; 
                case 1:
                    System.out.println("+ Tom Yum Seafood (50 Baht)");
                    chosenDishes.add("Tom Yum Seafood");
                    foodPrice += 50; 
                    break;
                case 2:
                    System.out.println("+ Seafood Fried Rice (100 Baht)");
                    chosenDishes.add("Seafood Fried Rice");
                    foodPrice += 100;
                    break;
                case 3:
                    System.out.println("+ Nasi Goreng (60 Baht)");
                    chosenDishes.add("Nasi Goreng");
                    foodPrice += 60;
                    break;
                case 4:
                    System.out.println("+ Fish and Chips (60 Baht)");
                    chosenDishes.add("Fish and Chips");
                    foodPrice += 60;
                    break;
                case 5:
                    System.out.println("+ Chicken Biryani (120 Baht)");
                    chosenDishes.add("Chicken Biryani");
                    foodPrice += 120;
                    break;
                default:
                    System.out.println("Enter 1 to 10!");
                break;
            }
        }
        System.out.print("Thanks. You chose ");
        for (int i = 0; i < chosenDishes.size(); i++){
            System.out.print(chosenDishes.get(i)); 
            if (i < chosenDishes.size() -1){
                System.out.print(" and "); 
            }
        }
        System.out.println(". ");
        System.out.println("Total price is " + foodPrice + " Baht. "); 
    }
}
