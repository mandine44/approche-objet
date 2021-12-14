package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		Collections.addAll(set, 1.5,8.25,-7.32,13.3,-12.45,48.5,0.01);
		
		for (Double d : set) {
			System.out.println(d);
		}
		
		System.out.println("Le plus grand element de la collection est : " + Collections.max(set));
		
		set.remove(Collections.min(set));
		
		for (Double d : set) {
			System.out.println(d);
		}
	}

}
