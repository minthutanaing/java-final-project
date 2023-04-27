import java.util.HashMap; 
    
public class Hotel {

    private String name; 
    private String address;
    private HashMap<String, Integer> rooms;

    /*private int contactNum; 
    private String email; 
    private double checkInTime;
    private double checkOutTime;*/

    public Hotel (String name, String address){
        this.name = name;
        this.address = address; 
        /*this.contactNum = contactNum; 
        this.email = email; 
        this.checkInTime = checkInTime; 
        this.checkOutTime = checkOutTime;*/
        this.rooms = new HashMap<String, Integer>(); 
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    /*public int getContactNum() { return contactNum; }
    public String getEmail() { return email; }
    public double getCheckInTime() {return checkInTime; }
    public double getCheckOutTime() {return checkInTime; }*/
    public HashMap<String,Integer> getRooms() { return rooms; }

}
