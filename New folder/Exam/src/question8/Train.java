package question8;

import java.util.Arrays;

public class Train {
private int ticketprice;
private String section;
private String traintype;
private Compartment []compartment;
private Engine engine;
public Train (int ticketprice,String section,String traintype,Compartment []compartment,Engine engine) {
	this.ticketprice=ticketprice;
	this.section=section;
	this.traintype=traintype;
	this.compartment=compartment;
	this.engine=engine;
}
public String toString() {
	return "Train [ticketprice=" + ticketprice + ", section=" + section + ", traintype=" + traintype + ", compartment="
			+ Arrays.toString(compartment) + ", engine=" + engine + "]";
}

public int getTicketprice() {
	return ticketprice;
}
public void setTicketprice(int ticketprice) {
	this.ticketprice=ticketprice;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section=section;
}
public String getTraintype() {
	return traintype=traintype;
}
public Compartment [] getCompartment() {
	return compartment;
}
public void setCompartment(Compartment []compartment) {
	this.compartment=compartment;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine enigne) {
	this.engine=enigne;
}
}
