package Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Name {

	public static void main(String[] args) {
		List<Integer>ni=Arrays.asList(20,30);
		List<Integer>as=ni.stream().filter(s->(s.equals(ni))).collect(Collectors.toList());
		ni.forEach(d->System.out.println(d));
	List<String> li =Arrays.asList("subashini","mano","asha","punitha");
	List<String> s =li.stream().filter(a->(a.startsWith("a"))).collect(Collectors.toList());
	s.forEach(b->System.out.println(b));
   List<String> c=li.stream().filter(d->(d.endsWith("a"))).collect(Collectors.toList());
   c.forEach(f->System.out.println(f));
	}

}
