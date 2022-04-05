package Day13febInheritence;

public class IndianBank {
int getLoan() {
	return 30000;
}
	int getLoan(int salaryslip) {
		return 30000+salaryslip*10;
	}
	int getLoan(int salaryslip,int propertyvalue) {
		return 30000+salaryslip*10+(propertyvalue*40/100);
		}
	void getLoaneligble(int age) {
		if(age>20&&age<30){
			System.out.println("300000");
			
		}
		else if(age>30&&age<40) {
			System.out.println("500000");	
		}
		else if(age>=40) {
			System.out.println("70000");
		}
		else {
			System.out.println("null");
		}
	}

}
