package Dayfeb10;

public class Books {
	int pages;
	int price;
	String name;

void findsize(Books[]a) {
	for(int i=0;i<a.length;i++) {
		if(this.pages<a[0].pages&&this.pages>a[1].pages) {
		System.out.println("same");
		}
		else if(a[0].pages>this.pages&&a[0].pages>a[1].pages) {
			System.out.println("samle");
		}
		else if(a[1].pages>this.pages&&a[1].pages>a[0].pages) {
			System.out.println("high");
		}
	}
}

	
}
}