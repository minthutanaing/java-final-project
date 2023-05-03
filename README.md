# java-final-project
# java-final-project-Hotel Reservation

The Rose Hotel is not a popular hotel but it is a soon-to-be popular one. 

It offers a lot of rooms to be reserved for the cutomers. The customers can reserve the rooms to prepare for the trip conveniently through this system. They can book as many as they need as the Hotel offers plenty of available rooms. It offers 20 single-room, 20 double-room and 10 suite-room at the 1st floor. At the 2nd floor, it provides 15 single-room, 15 double-room and 15 suite-room while it offers 25 single-room, 15 double-room and 10 suite-room at the 3rd floor. Moreover, the Hotel also provides free Wifi for the customers so that the customers can easily accessible what they need. 

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

The system has one main class and 6 relevant classes. The main class is "HotelApp class" and it includes "MealService class", "BookingRoom class", "HalalDietPlan class", "NormalDietPlan class", "Dinner class" and "Room class". 
 
 -------"HotelApp class"--------

 This class is the main class and crucial role of the system and it is responsible for executing the program and coordinating the overall functionality of other classes. In this main class, the instance of "BookingRoom class" is created and it calls BookingRoom's start() method to initiate the process of booking room system. Next, the main class generates the instance of "MealService class" and then calls its dinnerService() method to provide the two options for the meal: the Normal Diet Plan and the Halal Diet Plan. The main class also uses a "Scanner" object to allow the user to input their choice for room reservation and meal options.
