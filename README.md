# java-final-project
# java-final-project-Hotel Reservation

The Rose Hotel is not a popular hotel but it is a soon-to-be popular one. 

It offers a lot of rooms to be reserved for the cutomers. The customers can reserve the rooms to prepare for the trip conveniently through this system. They can book as many as they need as the Hotel offers plenty of available rooms. It offers 20 single-room, 20 double-room and 10 suite-room at the 1st floor. At the 2nd floor, it provides 15 single-room, 15 double-room and 15 suite-room while it offers 25 single-room, 15 double-room and 10 suite-room at the 3rd floor. 

Additionally, the Rose Hotel supplies Buffet for the customers as a breakfast. For the dinner, customers can order what they enjoy. The hotel provides two options for the meal. One is Normal Diet Plan and the another one is Halal Diet Plan. Customers can choose what they perfer. It also sets an afforable price for all the customers. 

The menu for Hala Food Diet is
1. Tom Yum seafood      - 50 baht
2. Seafood Fried rice   - 100 baht
3. Nasi Goreng          - 60 baht
4. Fish and chips       - 60 baht
5. Chicken Biryani      - 120 baht 
===enter zero to quit===

The menu for Normal Diet is
1. Pad Thai                             - 50 Baht 
2. Chicken reen Curry                   - 100 Baht
3. Chicken yello curry                  - 100 Baht 
4. Chicken red curry                    - 100 Baht 
5. Phat kra phoung with minced pork     - 50 Baht 
6. Thai Omelet with minced pork         - 50 Baht 
7. Khao Soi                             - 100 Baht 
8. Blood noodle soup                    - 50 Baht 
9. Chicken Fried rice                   - 50 Baht 
10. Pork Fried rice                     - 50 Baht 
===enter zero to quit===

-----Overview-----

The system has one main class and 6 relevant classes. The main class is "HotelApp class" and it includes "Room class", "BookingRoom class", "MealService class", "Dinner class", "HalalDietPlan class" and "NormalDietPlan class". 
 
"HotelApp class"---> This class is the main class and crucial role of the system and it is responsible for executing the program and coordinating the overall functionality of other classes. In this main class, the instance of "BookingRoom class" is created and it calls BookingRoom's start() method to initiate the process of booking room system. Next, the main class generates the instance of "MealService class" and then calls its dinnerService() method to provide the two options for the meal: the Normal Diet Plan and the Halal Diet Plan. The main class also uses a "Scanner" object to allow the user to input their choice for room reservation and meal options.

"Room class"---> Room class includes private instance variables: roomType(String), roomNum(int) and availability(boolean). It also has a constructor that takes in tow parameters(roomType and roomNum) and also has getter and setter methods. 

"BookingRoom class"---> The BookingRoom class is for handling the room booking process of the Hotel. The class uses a "Scanner" object to allow the user input and also uses two methods which are userPersonalInfo() and bookRoom(). The userPersonalInfo() method suggests the user to input their name and phone number which are stored as String and Long data types respectively. If the user input is invalid, a NumberFormatException is caught and an error message will be displayed. The bookRoom() method generates an ArrayList of Room objects that represents the available rooms in the Rose Hotel. It will then suggest the user to input the duration of their stay, the total number of rooms they want and the room type (ie. single-room, double-room or suite-room). Next, it will show the available booked room number and will calculate and display the total price based on the room type and duration of stay. If the user enter invalid input, an InputMismatchException is caught and an error message is displayed. The BookingRoom class also includes start() method that calls the userPersonalInfo() and bookRoom() methods to activate the room booking process.

"MealService class"---> The MealService class is responsible for generating the meal service functionality of the Rose Hotel. It includes dinnerService() method for providing the user with the options for ordering dinner whether a Normal Diet Plan or a Halal Diet Plan. To allow the user input, the class creates a "Scanner" object and also instances of the appropriate diet plan classes to display the corresponding menus. If the user decide not to order, the method will exist.

"Dinner class"---> This class is a super class of "HalalDietPlan class" and "NormalDietPlan class". 

"HalalDietPlan class"---> This class is a subclass of "Dinner class" and has two methods, displayHalalDietMenu() and chooseADish(). The first method reads the content of a text file named "halalfooddiet.txt" and prints. The text file contains a list of halal dishes including seafood and halal chicken dishes. The second method, chooseADish() method uses a while loop and a switch-case statement to suggest the user to input a number between 1 to 5. Based on the user input, the method will add the name of the chosen dish to an ArrayList called "chosenDishes" and then will update the total price fo the chosed dishes in a variable called "foodPrice" and then will print. 

"NormalDietPlan class"---> This class is also a subclass of "Dinner class" and also has two methods which are displayNormalDietMenu() and chooseADish() methods. The displayNormalDietMenu() method will read the file called "normaldiet.txt" file where the list of normal diet dishes are added and will print. The chooseADish() method uses a while loop and a switch statement to repeatedly prompt the user to input a number between 1 to 10 to select the dish. If the user enter number 0, the selecting process will be stopped. Then, the method will display the name of the the selected dish and the relevant price to the variables called "chosenDishes" and "foodPrice".

This is the end of the overall process of this Hotel Reservation program. Thanks for your attention. Hope you enjoy our program progress. 