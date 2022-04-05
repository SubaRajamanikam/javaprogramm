package Day2feb12Encapusation3;

public class Type {
	private int rooms;
	private String floor;
	
	public String toString() {
		return "Type [rooms=" + rooms + ", floor=" + floor + "]";
	}
	public Type(int rooms,String floor) {
		this.rooms=rooms;
		this.floor=floor;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms=rooms;
	}
	public String setFloor() {
		return floor;
	}
	public void getFloor(String floor) {
		this.floor=floor;
	}
}
