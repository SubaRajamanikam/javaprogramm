package Collect;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Stundents implements Serializable {
String name;
int id;

public Stundents(String name, int id) {
	this.name = name;
	this.id = id;
}

public static void main(String args[]) {
	try {
		Stundents s=new Stundents("bahavi",101);
		FileOutputStream fos=new FileOutputStream("trt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
        
		os.writeObject(s);
		os.flush();
		os.close();
		System.out.println("sises");
	
}
	catch(Exception e) {
		System.out.println("fail");
	}
}
}