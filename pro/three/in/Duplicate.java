package pro.three.in;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		int []a={10,10,20,20,30	};
		Set<Integer>s=new LinkedHashSet<>();
		for(int i=0;i<=a.length-1;i++) {
		s.add(a[i]);
		}
		System.out.println(s);
}
}