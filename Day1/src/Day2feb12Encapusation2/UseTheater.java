package Day2feb12Encapusation2;

public class UseTheater {

	public static void main(String[] args) {
	Address a=new Address(12,"mano","jayakodam","ariylur",621803);
	Speaker s1=new Speaker("oneplus","topleft");
	Speaker s2=new Speaker("lg","rightcorner");
	Speaker s3=new Speaker("samgsans","leftcorner");
	Speaker [] s= {s1,s2,s3};
	Screen ss=new Screen(10,25.6f,"steel");
	Theater t=new Theater("kamela","rrr",a,s,ss);
	
	System.out.println(t);
	System.out.println(t.findare());
	}

}
