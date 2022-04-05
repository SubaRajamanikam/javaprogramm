package question8;

public class Engine {
private int fuel;
private int speed;
private String id;
public Engine(int fuel, int speed, String id) {
	this.fuel = fuel;
	this.speed = speed;
	this.id = id;
}
public String toString() {
	return "Engine [fuel=" + fuel + ", speed=" + speed + ", id=" + id + "]";
}
public int getFuel() {
	return fuel;
}
public void setFuel(int fuel) {
	this.fuel = fuel;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
