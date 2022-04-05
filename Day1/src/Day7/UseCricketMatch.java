package Day7;
public class UseCricketMatch {

	public static void main(String[] args) {
		Players a=new Players();
		 a.name="dhoni";
		 a.playerrole="rounder";
		 a.age=22;
		Players b=new Players();
		b.name="koli";
		b.playerrole="bowler";
		b.age=35;
		Players c=new Players();
		c.name="thagur";
		c.playerrole="batsman";
		c.age=45;
		Players d=new Players();
		d.name="jedige";
		d.playerrole="allrounder";
		d.age=29;
		
		Players[]p= {a,b,c,d};
		CricketMatch f=new CricketMatch();
		f.stadium="cheepakkam";
		f.audience=1000000l;
		f.format="ipl";
		f.tornementname="t20";
		System.out.println(f.stadium+","+f.audience+","+f.format+","+f.tornementname+","+p[0].name+p[0].playerrole+","+p[0].age);
		System.out.println(f.stadium+","+f.audience+","+f.format+","+f.tornementname+","+p[1].name+p[1].playerrole+","+p[1].age);
		System.out.println(f.stadium+","+f.audience+","+f.format+","+f.tornementname+","+p[2].name+p[2].playerrole+","+p[2].age);
	}
	}
	
	


