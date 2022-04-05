package Day2feb12Encapuslation;

public class UseCollege {

	public static void main(String[] args) {
		Address a=new Address(12,"subashini","omr","chennai",23608);
		Course c1=new Course("bba",2019);
		Course c2=new Course("bsc",2020);
		Course c3=new Course("bcom",2021);
		Course c4=new Course("bbm",2018);
		Course []c={c1,c2,c3};
		Universtie u=new Universtie("anna universtie","tamilenadu");
		College g=new College(2,"MG womens",a,c,u);
		System.out.println(g);
	}

}
