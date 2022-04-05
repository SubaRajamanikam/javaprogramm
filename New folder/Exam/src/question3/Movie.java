package question3;

import java.util.Arrays;

public class Movie {
private String name;
private int timelength;
private String releasedate;
private SupportingActor []supportingactors;
private LeadActor leadactor;
public Movie(String name, int timelength, String releasedate, SupportingActor[] supportingactors, LeadActor leadactor) {
	this.name = name;
	this.timelength = timelength;
	this.releasedate = releasedate;
	this.supportingactors = supportingactors;
	this.leadactor = leadactor;
}
public String toString() {
	return "Movie [name=" + name + ", timelength=" + timelength + ", releasedate=" + releasedate + ", supportingactors="
			+ Arrays.toString(supportingactors) + ", leadactor=" + leadactor + "]";
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTimelength() {
	return timelength;
}
public void setTimelength(int timelength) {
	this.timelength = timelength;
}
public String getReleasedate() {
	return releasedate;
}
public void setReleasedate(String releasedate) {
	this.releasedate = releasedate;
}
public SupportingActor[] getSupportingactors() {
	return supportingactors;
}
public void setSupportingactors(SupportingActor[] supportingactors) {
	this.supportingactors = supportingactors;
}
public LeadActor getLeadactor() {
	return leadactor;
}
public void setLeadactor(LeadActor leadactor) {
	this.leadactor = leadactor;
}


}
