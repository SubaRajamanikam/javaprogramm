package Day7;

public class UseCollege2 {

public static void main(String[]args) {
	College1 m=new College1();
	m.coursname="jave";
	m.fees=70000;
	m.tranername="prakesh";
	m.studentname="subashini";
	College1 m1=new College1();
	m1.coursname="pythen";
	m1.fees=50000;
	m1.tranername="prakesh";
	m1.studentname="subashini";
	College1 m2=new College1();
	m2.coursname="c++";
	m2.fees=25000;
	m2.tranername="prakesh";
	m2.studentname="subashini";
	College1 []a= {m,m1,m2};
	System.out.println(a[0].coursname+"'"+a[0].fees+"'"+a[0].tranername+","+a[0].studentname);
	System.out.println(a[1].coursname+"'"+a[1].fees+"'"+a[1].tranername+","+a[1].studentname);
	System.out.println(a[2].coursname+"'"+a[2].fees+"'"+a[2].tranername+","+a[2].studentname);
	System.out.println(a[0].coursname+","+a[1].coursname+","+a[2].coursname);
	System.out.println(a[0].fees+","+a[1].fees+","+a[2].fees);
	System.out.println(a[0].tranername+","+a[1].tranername+","+a[2].tranername);
	System.out.println(a[0].studentname+","+a[1].studentname+","+a[2].studentname);

		if(a[0].fees>a[1].fees&&a[0].fees>a[2].fees){
		System.out.println(a[0].coursname+"is high fees");

		}
		else {
			System.out.println(a[0].coursname+"not high fees");
		}
		if(a[1].fees>a[0].fees&&a[1].fees>a[2].fees){
			System.out.println(a[1].coursname+"is high fees");
		}

		else {
			System.out.println(a[1].coursname+"not high fees");
		}
		if(a[2].fees>a[0].fees&&a[2].fees>a[1].fees){
			System.out.println(a[2].coursname+"is high fees");
	}
		else {
			System.out.println(a[2].coursname+"not high fees");
}
	   int  trnernamecount=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].coursname+","+a[i].fees+","+a[i].studentname+","+a[i].tranername);
			if(a[i].tranername=="prakesh") {
				trnernamecount=trnernamecount+1;
				
			
			}
		}
		System.out.println(trnernamecount);

		}
}

