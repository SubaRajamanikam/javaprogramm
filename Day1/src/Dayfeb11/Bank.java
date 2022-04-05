package Dayfeb11;

public class Bank {
int age;
String name;
int amount;
void findloan(Bank [] b) {
	for(int i=0;i<b.length;i++) {
	if(b[i].age>20 && 30>b[i].age) {
		System.out.println("200000");
	}
	else if(b[i].age>30 && 40>b[i].age) {
		System.out.println("500000");
	}
	else if(b[i].age>=40) {
		System.out.println("50000");
	}
	else {
		System.out.println("null");
	}
}
}
}
