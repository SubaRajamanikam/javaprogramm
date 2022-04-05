package Day2feb12Encapuslation;

public class Universtie {
private String name;
private String state;
public Universtie(String name, String state) {
	super();
	this.name = name;
	this.state = state;
}
public String toString() {
	return "Universtie [name=" + name + ", state=" + state + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
