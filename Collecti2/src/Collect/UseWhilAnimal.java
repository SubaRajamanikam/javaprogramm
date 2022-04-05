package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class UseWhilAnimal {

	public static void main(String[] args) {
		WhilAnimal a1 = new WhilAnimal("tiger", "liaonfamily", 60, "male");
		WhilAnimal a2 = new WhilAnimal("dog", "dogfamily", 20, "female");
		WhilAnimal a3 = new WhilAnimal("elephent", "cowfamily", 80, "male");
		WhilAnimal a4 = new WhilAnimal("liaon", "liaonfamily", 60, "female");
		ArrayList<WhilAnimal> wa = new ArrayList<>();
		wa.add(a1);
		wa.add(a2);
		wa.add(a3);
		wa.add(a4);
//		for (int i = 0; i < wa.size(); i++) {
//			System.out.println(wa.get(i));
//		}
//		for (WhilAnimal a : wa) {
//			System.out.println(a);
//		}
//		Iterator it = wa.iterator();
//		while (it.hasNext()) {		
//		System.out.println(it.next());
//		}
//		wa.forEach(k -> System.out.println(k));

		ArrayList<WhilAnimal> male = new ArrayList<>();
		for (WhilAnimal w : wa) {
			if (w.getGender().equals("male")) {
				male.add(w);
			}
		}
		male.forEach(x->System.out.println(x));

	}

}
