package Day2feb12Encapusation3;

public class Member {
private String nmae;
private int age;
private boolean ismarried;
public Member(String nmae, int age, boolean ismarried) {
	super();
	this.nmae = nmae;
	this.age = age;
	this.ismarried = ismarried;
}
public String toString() {
	return "Member [nmae=" + nmae + ", age=" + age + ", ismarried=" + ismarried + "]";
}
public String getNmae() {
	return nmae;
}
public void setNmae(String nmae) {
	this.nmae = nmae;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isIsmarried() {
	return ismarried;
}
public void setIsmarried(boolean ismarried) {
	this.ismarried = ismarried;
}

}
