package question2;

public class UseHomeTheater {
	public static void main(String args[]) {
	
Speaker s1=new Speaker("plastic","sony",12.5f);
Speaker s2=new Speaker("steel","lg",13.5f);
Speaker s3=new Speaker("iron","oneplus",11.8f);
Speaker []ss= {s1,s2,s3};
Woofer w=new Woofer("wood",5.2f,500);
HomeTheater hm=new HomeTheater(2,"Redmi","anroide",30000,ss,w);
System.out.println(hm);

}
}