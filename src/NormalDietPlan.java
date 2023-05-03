import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NormalDietPlan extends Dinner{
    Scanner scanner = new Scanner(System.in);

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
        ArrayList<String> chosenDishes = new ArrayList<>();
        int choice = -1; 
        int foodPrice = 0; 
        while (choice != 0){
            System.out.println("Enter 1 to 10:");
            choice = scanner.nextInt(); 
            switch (choice){
                case 0: 
                    break; 
                case 1:
                    System.out.println("+ Pad Thai (50 Baht)");
                    chosenDishes.add("Pad Thai");
                    foodPrice += 50; 
                    break;
                case 2:
                    System.out.println("+ Chicken green curry (100 Baht)");
                    chosenDishes.add("Chicken green curry");
                    foodPrice += 100;
                    break;
                case 3:
                    System.out.println("+ Chicken yellow curry (100 Baht)");
                    chosenDishes.add("Chicken yellow curry");
                    foodPrice += 100;
                    break;
                case 4:
                    System.out.println("+ Chicken red curry (100 Baht)");
                    chosenDishes.add("Chicken red curry");
                    foodPrice += 100;
                    break;
                case 5:
                    System.out.println("+ Phat kra phoung with minced pork (50 Baht)");
                    chosenDishes.add("Phat kra phoung with minced pork");
                    foodPrice += 50;
                    break;
                case 6:
                    System.out.println("+ Thai omelet with minced pork (50 Baht)");
                    chosenDishes.add("Thai omelet with minced pork");
                    foodPrice += 50;
                    break;
                case 7:
                    System.out.println("+ Khao Soi (100 Baht)");
                    chosenDishes.add("Khao Soi");
                    foodPrice += 50;
                    break;
                case 8:
                    System.out.println("+ Blood noodle soup (50 Baht)");
                    chosenDishes.add("Blood noodle soup");
                    foodPrice += 50;
                    break;
                case 9:
                    System.out.println("+ Chicken fried rice (50 Baht)");
                    chosenDishes.add("Chicken fried rice");
                    foodPrice += 50;
                    break;
                case 10:
                    System.out.println("+ Pork fried rice (50 Baht)");
                    chosenDishes.add("Pork fried rice");
                    foodPrice += 50;
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
