package question3;

public class UseMovie {
    public static void main(String [] args) {
    SupportingActor s1=new SupportingActor("babu","comeidy",10000);
    SupportingActor s2=new SupportingActor("shella","guset",8000);
    SupportingActor s3=new SupportingActor("vashu","friend",15000);
    SupportingActor []ss= {s1,s2,s3};
    LeadActor la=new LeadActor("vijay",500000,true);
    Movie m=new Movie("master",2,"12oct",ss,la);
    System.out.println(m);
	}

}
