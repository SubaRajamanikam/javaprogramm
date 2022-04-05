package Day2feb12Encapusation2;

import java.util.Arrays;

public class Theater {
 private String name;
 private String moveie;
 private Address address;
 private Speaker [] speaker;
 private Screen screen;
public Theater(String name, String moveie, Address address, Speaker[] speaker, Screen screen) {
	super();
	this.name = name;
	this.moveie = moveie;
	this.address = address;
	this.speaker = speaker;
	this.screen = screen;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMoveie() {
	return moveie;
}
public void setMoveie(String moveie) {
	this.moveie = moveie;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Speaker[] getSpeaker() {
	return speaker;
}
public void setSpeaker(Speaker[] speaker) {
	this.speaker = speaker;
}
public Screen getScreen() {
	return screen;
}
public void setScreen(Screen screen) {
	this.screen = screen;
}
float findare() {
	return screen.getLength()*screen.getWeight();
}
public String toString() {
	return "Theater [name=" + name + ", moveie=" + moveie + ", address=" + address + ", speaker="
			+ Arrays.toString(speaker) + ", screen=" + screen + "]";
}
	 
 }

