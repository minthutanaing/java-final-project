public class Room {
    private String roomType;
    private int roomNum;
    private boolean availability;

    public Room (String roomType, int roomNum){
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.availability = true;
    }

    public String getRoomType() {return roomType; }
    public void setRoomType(String roomType) {this.roomType = roomType; }
    public int getRoomNum() {return roomNum;}
    public void setRoomNum(int roomNum) {this.roomNum = roomNum; }
    public boolean getRoomAvailability() { return availability; }
    public void setAvailability(boolean availability){ this.availability = availability;}
}
