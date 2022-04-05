package Day2feb12Encapusation3;

import java.util.Arrays;

public class Home {
private String name;
private Member []members;
private Address address;
private Type type;
public Home(String name, Member[] members, Address address, Type type) {
	super();
	this.name = name;
	this.members = members;
	this.address = address;
	this.type = type;
}
public String getName() {
	return name;
}
public void setNmae(String name) {
	this.name=name;
}
public Member [] getMember() {
	return members;
}
public void setMember(Member []member) {
	this.members=member;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address=address;

}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type=type;
}
public String toString() {
	return "Home [name=" + name + ", members=" + Arrays.toString(members) + ", address=" + address + ", type=" + type
			+ "]";
}
String floorfind() {
	if(address.getDoorno()%2==0) {
		
	}
}
}
}